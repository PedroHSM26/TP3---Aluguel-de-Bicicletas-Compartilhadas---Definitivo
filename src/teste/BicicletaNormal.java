package teste;

public class BicicletaNormal {
	private Long marcha;
	
	public BicicletaNormal() {
		super();
	}
	
	// Tamb�m Colocar aqui os atributos e m�todos da classe abstrata Bicicleta usando this
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
