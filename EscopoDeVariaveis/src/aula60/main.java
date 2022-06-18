package aula60;

public class main {

	public static void main(String[] args) {
		EscopoVariavel escopo = new EscopoVariavel();
		
		escopo.setValor(10);

		System.out.println(escopo.getValor());//10
		System.out.println(escopo.calculaValor(20));//30
		System.out.println(escopo.getValor());
		System.out.println(escopo.teste());
		System.out.println(escopo.getValor());
		
	}

}
