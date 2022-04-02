package modelo;

public class BicicletaNormal extends Bicicleta {

	private Integer marcha; //Tempo de vida da marcha (***)
	
	public BicicletaNormal(Integer idBicicleta, Boolean estadoUso, Double tempoUso, Integer idadeBicicleta, Integer marcha, Posto posto) {
		super(idBicicleta, estadoUso, tempoUso, idadeBicicleta);
		
		this.marcha = marcha;
		
	}

	public Integer getMarcha() {
		return marcha;
	}

	public void setMarcha(Integer marcha) {
		this.marcha = marcha;
	}

	
	
	
}