package aula73;

public class MinhaThreads implements Runnable {

	private String nome;
	private boolean estaSuspensa;
	private boolean foiTerminada;

	public MinhaThreads(String nome) {
		this.nome = nome;
		this.estaSuspensa = false;
		new Thread(this, nome).start();
	}

	@Override
	public void run() {
		System.out.println("Executando " + this.nome);

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread " + nome +" "+i);
			
				Thread.sleep(300);
				synchronized (this) {
					while(estaSuspensa) {
						wait();
					}
					if(this.foiTerminada) {
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread " + this.nome + " terminada.");
	}

	void suspende() {
		this.estaSuspensa=true;
	}
	synchronized void resume() {
		this.estaSuspensa=false;
		notify();
	}
	synchronized void stop() {
		this.foiTerminada=true;
		notify();
	}
}
