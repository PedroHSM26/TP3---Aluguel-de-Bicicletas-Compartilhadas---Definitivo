package modelo;

public class BicicletaEletrica extends Bicicleta {

	private Integer energia; //Quantidade de energia da bicicleta eletrica (***)
	
	public BicicletaEletrica(Integer idBicicleta, Boolean estadoUso, Double tempoUso, Integer idadeBicicleta,
			String qrCode, Integer energia, Posto posto) { //Constructor da bicicleta eletrica
		
		super(idBicicleta, estadoUso, tempoUso, idadeBicicleta, qrCode);
		this.setEnergia(energia);
		
	}

	public Integer getEnergia() {
		return energia;
	}

	public void setEnergia(Integer energia) {
		this.energia = energia;
	}

	
	


}