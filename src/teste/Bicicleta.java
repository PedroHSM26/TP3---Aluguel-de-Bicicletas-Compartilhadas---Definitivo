package teste;

public abstract class Bicicleta {
	protected int idBicicleta;
	protected Boolean estadoUso;
	protected Double tempoUso;
	protected Long idadeBicicleta;
	protected String qrCode;
	
	public Bicicleta() {
		super();
	}
	
	
	public int getIdBicicleta() {
		return idBicicleta;
	}
	public void setIdBicicleta(int idBicicleta) {
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
	public Long getIdadeBicicleta() {
		return idadeBicicleta;
	}
	public void setIdadeBicicleta(Long idadeBicicleta) {
		this.idadeBicicleta = idadeBicicleta;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	
	
}
