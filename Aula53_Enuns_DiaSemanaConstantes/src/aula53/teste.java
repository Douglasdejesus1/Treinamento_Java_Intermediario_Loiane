package aula53;

public class teste {

	public static void main(String[] args) {
	//	usandoConstante();
		usandoEnum();

	}

	public static void usandoConstante() {
		int segunda =DiaSemanaConstantes.SEGUNDA_FEIRA;
		int terca =DiaSemanaConstantes.TERCA_FEIRA;
		int quarta =DiaSemanaConstantes.QUARTA_FEIRA;
		int quinta =DiaSemanaConstantes.QUINTA_FEIRA;
		int sexta =DiaSemanaConstantes.SEXTA_FEIRA;
		int sabado =DiaSemanaConstantes.SABADO;
		int domingo =DiaSemanaConstantes.DOMINGO;
		System.out.println("teste constante:");
		/*imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);*/
	}
	

	public static void imprimeDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("segunda");
			break;
		case TERCA:
			System.out.println("terca");
			break;
		case QUARTA:
			System.out.println("quarta");
			break;
		case QUINTA:
			System.out.println("quinta");
			break;
		case SEXTA:
			System.out.println("sexta");
			break;
		case SABADO:
			System.out.println("sabado");
			break;
		case DOMINGO:
			System.out.println("domingo");
			break;
		}
	}
	private static void usandoEnum() {
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		System.out.println("Teste usando enum: ");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	
				
	}

}
