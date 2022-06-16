package CalculadoraEnum;

import aula56.GeraCpfCnpj;

public enum Operacao {

	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x+y;
		}
	},
	DIVIDIR("/"){

	@Override
	public double executarOperacao(double x, double y) {
		return x / y;
	}

	},
	SUBTRAIR("-"){

	@Override
	public double executarOperacao(double x, double y) {
		return x - y;
	}

	},
	MULTIPLICAR("*"){

	@Override
	public double executarOperacao(double x, double y) {
		return x * y;
	}};

	private String sinal;

	Operacao(String sinal) {
		this.sinal = sinal;
	}

	public abstract double executarOperacao(double x, double y);

	public String toString() {
	 return this.sinal;
 }

}
