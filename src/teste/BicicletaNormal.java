package teste;

public class BicicletaNormal {
	private Long marcha;
	
	public BicicletaNormal() {
		super();
	}
	
	//Sobrecarga
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
