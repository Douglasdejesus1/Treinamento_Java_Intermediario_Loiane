package aula54;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.toString()+" -"+dia.getValor());
		System.out.println(dia);
		/*Enums exteds a classe java.lang.Enum
		 * podem ser comparados usando o ==
		 * não podem ser instanciadas com o new
		 * podem implementar interfaces
		 * pode ser declarado separadamente ou dento de classe
		  */
		
		Data data = new Data(04, 10, 1990, DiaSemana.QUINTA);
		
		System.out.println(data);
		 
	}

} 
