package teste;

public class BicicletaNormal {
	private Long marcha;
	
	public BicicletaNormal() {
		super();
	}
	
	// Também Colocar aqui os atributos e métodos da classe abstrata Bicicleta usando this
	public BicicletaNormal(Long m) {
		marcha = m;
	}

	public Long getMarcha() {
		return marcha;
	}

	public void setMarcha(Long marcha) {
		this.marcha = marcha;
	}
}
