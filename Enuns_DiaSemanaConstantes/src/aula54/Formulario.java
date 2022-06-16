package aula54;

public class Formulario {
	
	enum Genero{
		FEMININO('f'), MASCULINO('m');
		private char valor;

		private Genero(char valor) {
			this.valor = valor;
		}

		public char getValor() {
			return valor;
		}
		
		
	}
 private String nome;
 private Genero genero;
 
 
}
