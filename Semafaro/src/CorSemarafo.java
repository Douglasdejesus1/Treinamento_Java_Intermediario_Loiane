
public enum CorSemarafo {
	VERDE(100),VERMELHO(500),AMARELO(800);
	
	private int tempoEspera;

	private CorSemarafo(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}
	

}
