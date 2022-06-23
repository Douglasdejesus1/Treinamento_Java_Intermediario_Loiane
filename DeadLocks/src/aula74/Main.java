package aula74;

public class Main {
	public static void main(String[] args) {

		final String RECUSO1 = "Recurso #1";
		final String RECUSO2 = "Recurso #1";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (RECUSO1) {
					System.out.println("Thread #1 bloqueou o recurso 1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread #1: tentando acesso ao recurso 2");
					synchronized (RECUSO2) {
						System.out.println("Thread #1 bloqueou o recurso 2");
						
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (RECUSO2) {
					System.out.println("Thread #2 bloqueou o recurso 2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread #2: tentando acesso ao recurso 1");
					synchronized (RECUSO1) {
						System.out.println("Thread #2 bloqueou o recurso 1");
						
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
