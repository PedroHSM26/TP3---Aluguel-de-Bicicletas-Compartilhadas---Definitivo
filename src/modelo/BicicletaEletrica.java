package modelo;

/**
 * 
 * @author Pedro henrique
 * <h2>Model Bicicleta elétrica</h2>
 * <br>
 * <p>
 * classe que recebe de herança a bicicleta <br>
 * e atua com o <strong>atributo energia</strong>
 * </p>
 *
 */
public class BicicletaEletrica extends Bicicleta {

	private Integer energia;
	
	public BicicletaEletrica(Integer idBicicleta, Boolean estadoUso, Double tempoUso, Integer idadeBicicleta,
			String qrCode, Integer energia, Posto posto) {
		
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