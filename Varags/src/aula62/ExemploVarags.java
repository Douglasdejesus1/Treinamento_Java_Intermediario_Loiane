package aula62;

public class ExemploVarags {

	public static void main(String[] args) {

		System.out.println(soma(4,6));
		System.out.println(soma(4,6,8));
		int [] vetor = {1,2,3,4,5};
		System.out.println(soma(vetor));
		System.out.println(somaV(1,2,3,4,5,6));
		
		
	}
	static int soma(int a, int b) {
		return a+b;
	}
	static int soma(int a, int b, int c) {
		return a+b+c;
	}
	static int soma(int[] vetor) {
		int total=0;
		for(int i=0; i<vetor.length;i++) {
			total+=vetor[i];
		}
		
		return total;
	}
	static int somaV(Integer... vetor) {
		int total=0;
		for(int i=0; i<vetor.length;i++) {
			total+=vetor[i];
		}
		
		return total;
	}

}
