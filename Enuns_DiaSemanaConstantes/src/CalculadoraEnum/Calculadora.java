package CalculadoraEnum;

import aula56.TipoDocumento;

public class Calculadora {
	public static void main(String[] args) {
		double x=5;
		double y=2;
		
		for(Operacao op: Operacao.values()) {
			System.out.println(op.executarOperacao(x, y));
		}
	

}
}

