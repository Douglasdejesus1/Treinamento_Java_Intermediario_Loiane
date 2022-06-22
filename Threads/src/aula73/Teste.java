package aula73;

public class Teste {

	public static void main(String[] args) {

		MinhaThreads t1 = new MinhaThreads("#1");
		MinhaThreads t2 = new MinhaThreads("#2");
		t1.suspende();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Pausando a Thread #2");
		t2.suspende();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.resume();
		t2.resume();
		t2.stop();
	}

}
