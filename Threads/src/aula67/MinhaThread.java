package aula67;

public class MinhaThread extends Thread {
	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	public void run() {
		try {
		for(int i =0; i<6; i++) {
			Thread.sleep(tempo);
			System.out.println(nome+" contador "+i);
			}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(nome+" terminou a execução");
	}

}
