
public class ThreadSemafaro implements Runnable {

	private CorSemarafo cor;
	private boolean parar;
	private boolean corMudou;

	Thread t;

	public ThreadSemafaro() {
		this.cor = CorSemarafo.VERMELHO;
		new Thread(this).start();

	}

	@Override
	public void run() {
		while (!parar) {
			try {
				/*switch (this.cor) {
				case VERMELHO:
					//Thread.sleep(400);
					break;
				case AMARELO:
					//Thread.sleep(300);
					break;
				case VERDE:
					//Thread.sleep(500);
					break;
					default:
						break;

				}*/
				Thread.sleep(this.cor.getTempoEspera());
				this.mudarCor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemarafo.VERDE;
			break;
		case AMARELO:
			this.cor = CorSemarafo.VERMELHO;
			break;
		case VERDE:
			this.cor = CorSemarafo.AMARELO;
			break;
			default:
				break;
		}
		this.corMudou=true;
		notify();
		
	}
	public synchronized void esperaCorMudar() {
		while(!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.corMudou=false;
	}
	public synchronized void desligarSemafaro() {
		this.parar=true;
	}

	public CorSemarafo getCor() {
		return cor;
	}
	
}
