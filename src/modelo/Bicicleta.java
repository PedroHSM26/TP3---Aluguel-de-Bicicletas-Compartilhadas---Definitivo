package modelo;

public abstract class Bicicleta {
	protected Integer idBicicleta; //Identificador da bicileta
	protected Boolean estadoUso; //A bicicleta esta em uso ou livre
	protected Double tempoUso; //Quantidade de tempo que um usuario esta utilizando a bicicleta
	protected Integer idadeBicicleta; //Tempo de vida da bicicleta
	
	public Bicicleta(Integer idBicicleta, Boolean estadoUso, Double tempoUso, Integer idadeBicicleta) { //constructor do objeto bicicleta
		super();
		this.idBicicleta = idBicicleta;
		this.estadoUso = estadoUso;
		this.tempoUso = tempoUso;
		this.idadeBicicleta = idadeBicicleta;
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

}