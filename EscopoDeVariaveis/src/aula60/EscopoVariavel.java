package aula60;

public class EscopoVariavel {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor) {
		valor += 10;
		this.valor=valor;
		return valor;
	}
	public int teste() {
		int valor=5;
		if(true) {
			valor--;
		}
		this.valor = valor;
		return valor;
	}
	public void outroTeste() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		//i++; erro de copilacao;
		int j;
		for(j=10;j<10;j++) {
			System.out.println(j);
		}
		System.out.println(j);
	}
	public void maisUmTeste() {
		boolean flag=true;
		//if(flag)
	}
}
