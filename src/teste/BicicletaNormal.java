package teste;

public class BicicletaNormal extends Bicicleta {

	private Integer marcha;
	
	public BicicletaNormal(Integer idBicicleta, Boolean estadoUso, Double tempoUso, Integer idadeBicicleta,
			String qrCode, Integer marcha, Posto posto) {
		super(idBicicleta, estadoUso, tempoUso, idadeBicicleta, qrCode);
		
		this.marcha = marcha;
		
	}

	public Integer getMarcha() {
		return marcha;
	}

	public void setMarcha(Integer marcha) {
		this.marcha = marcha;
	}

	
	
	
}