package modelo;

/**
 * 
 * @author Pedro henrique
 * <h2>Model Bicicleta normal</h2>
 * <br>
 * <p>
 * classe que recebe de herança a bicicleta <br>
 * e atua com o <strong>atributo marcha</strong>
 * </p>
 *
 */
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