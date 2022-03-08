package teste;

public class BicicletaNormal extends Bicicleta {
	private Long marcha;
	
	public BicicletaNormal() {
		super();
	}
	
	// Tamb�m Colocar aqui os atributos e m�todos da classe abstrata Bicicleta usando this
	public BicicletaNormal(Long m, int idBicicletaNormal) {
		marcha = m;
		idBicicleta = idBicicletaNormal;
	}

	public Long getMarcha() {
		return marcha;
	}

	public void setMarcha(Long marcha) {
		this.marcha = marcha;
	}
}
