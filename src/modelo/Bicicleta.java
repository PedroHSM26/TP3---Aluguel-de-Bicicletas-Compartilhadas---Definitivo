package modelo;

/**
 * 
 * @author Juan mangueira alves
 * <h2>Model Bicicleta</h2>
 * <br>
 * <p>
 * classe responsável por servir de modelo da bicicleta <br>
 * é a classe mãe das classes <strong>bicicleta normal</strong> e <strong>bicicleta elétrica</strong>
 * </p>
 * Aqui nós temos os atributos:
 * <ul>
 * <li>Id bicicleta</li>
 * <li>estado de uso</li>
 * <li>tempo de uso</li>
 * <li>idade bicicleta</li>
 * <li>qr code</li>
 * </ul>
 *
 */

public abstract class Bicicleta {
	protected Integer idBicicleta;
	protected Boolean estadoUso;
	protected Double tempoUso;
	protected Integer idadeBicicleta;
	protected String qrCode;
	
	public Bicicleta(Integer idBicicleta, Boolean estadoUso, Double tempoUso, Integer idadeBicicleta, String qrCode) {
		super();
		this.idBicicleta = idBicicleta;
		this.estadoUso = estadoUso;
		this.tempoUso = tempoUso;
		this.idadeBicicleta = idadeBicicleta;
		this.qrCode = qrCode;
	}

	public Integer getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(Integer idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

	public Boolean getEstadoUso() {
		return estadoUso;
	}

	public void setEstadoUso(Boolean estadoUso) {
		this.estadoUso = estadoUso;
	}

	public Double getTempoUso() {
		return tempoUso;
	}

	public void setTempoUso(Double tempoUso) {
		this.tempoUso = tempoUso;
	}

	public Integer getIdadeBicicleta() {
		return idadeBicicleta;
	}

	public void setIdadeBicicleta(Integer idadeBicicleta) {
		this.idadeBicicleta = idadeBicicleta;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	
	
	
	
}