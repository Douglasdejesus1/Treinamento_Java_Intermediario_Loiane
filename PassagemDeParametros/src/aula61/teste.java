package aula61;

public class teste {

	public static void main(String[] args) {
		Contato contato= new Contato("Contato 1", "1234-4567", "contato1@email.com");
		int valor = 10;
		System.out.println(contato);
		System.out.println(valor);
		System.out.println();
		
		testePassagemValorReferencia(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		System.out.println();
		
		testePassagemValorReferencia2(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		System.out.println();

	}
	private static void testePassagemValorReferencia(int valor, Contato contato) {
		int novoValor = valor+10;
		valor= novoValor;
		contato.setNome("Douglas");
		contato= new Contato("Contato 2", "2345-6789", "contato2@email.com");
	}
	private static void testePassagemValorReferencia2(int valor, Contato contato) {
	int novoValor = valor+10;
	valor= novoValor;
	contato.setNome("Contato"+novoValor);
	}

}
