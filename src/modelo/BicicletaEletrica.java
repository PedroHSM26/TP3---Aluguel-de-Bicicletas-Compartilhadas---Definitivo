package modelo;

public class BicicletaEletrica extends Bicicleta {

	private Integer energia; //Quantidade de energia da bicicleta eletrica (***)
	
	public BicicletaEletrica(Integer idBicicleta, Boolean ocupacao, Integer tipoBicicleta, Integer energia, Posto posto) { //Constructor da bicicleta eletrica
		
		super(idBicicleta, ocupacao, tipoBicicleta);
		this.setEnergia(energia);
		
	}

	public Integer getEnergia() {
		return energia;
	}

	public void setEnergia(Integer energia) {
		this.energia = energia;
	}

	
	


}