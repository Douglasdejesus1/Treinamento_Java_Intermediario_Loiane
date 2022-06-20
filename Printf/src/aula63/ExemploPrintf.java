package aula63;

public class ExemploPrintf {

	public static void main(String[] args) {

		// String %s, String Caixa aula $S, char %c ou %C
		System.out.printf("%s", "Ola, Mundo!");
		System.out.println();
		System.out.printf("%S", "Ola, Mundo!");
		System.out.println();

		System.out.printf("%c", 'm');
		// "%n" para pular linha
		System.out.printf("%n");
		System.out.printf("%n");
		System.out.printf("%C", 'm');
		System.out.printf("%n");

		// %d para numeros inteiros
		int valor = 123456;
		System.out.printf("%d", valor);
		System.out.printf("%n");
		// %f para ponto flutuante
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);
		System.out.printf("%n");

		// espaçamento a direita
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo);
		System.out.printf("%n");
		// espaçamento a esquerda
		System.out.printf("%-20s", olaMundo);
		System.out.printf("%-20s", olaMundo);

		// mostra o sinal do numero
		System.out.printf("%+d", valor);
		System.out.printf("%n");
		System.out.printf("%n");

		// mostra o sinal do numero
		System.out.printf("%015d", valor);
		System.out.printf("%n");
		System.out.printf("%n");

		int valor2 = -56789;

		// adiciona um espaco caso nao seja negativo
		System.out.printf("% d", valor2);
		System.out.printf("%n");
		System.out.printf("% d", valor);
		System.out.printf("%n");
		System.out.printf("%n");

		// casas decimais
		System.out.printf("%.30f", pontoFlutuante);
		System.out.printf("%n");
		// concatenage+espaçamento+casas decimais
		System.out.printf("R$%10.2f", pontoFlutuante);

		System.out.printf("%n");
		System.out.printf("%n");
		testeMaisCompleto();
		System.out.printf("%n");
		System.out.printf("%n");
		testeMaisCompleto2();
		

	}

	private static void testeMaisCompleto() {
		double [] precos = {1000,123.54,7843.567,1,4.56789,12453.65654};
		for(int i=0; i<precos.length;i++) {
			System.out.printf("R$%9.2f",precos[i]);
			System.out.printf("%n");
		}
	}

	private static void testeMaisCompleto2() {
		double[] precos = { 1000, 123.54, 7843.567, 1, 4.56789, 12453.65654 };
		double total=0;
		for (int i = 0; i < precos.length; i++) {
			total+=precos[i];
			System.out.printf("%s %02d: total de R$%,10.2f%n","Item",i+1, precos[i]);
		}
		System.out.printf("%S %02d, SOMA DA NOTA R$%,10.2f%n","Itens:",precos.length+1, total);
		

	}

}
