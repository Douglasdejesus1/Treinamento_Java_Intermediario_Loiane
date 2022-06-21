package aula68;

public class Teste {

	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1",900);
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2",600);
		//Thread t2 = new Thread(thread2);
		//t2.start();
	}

}
