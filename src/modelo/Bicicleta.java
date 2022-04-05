package modelo;

public abstract class Bicicleta {
	protected Integer idBicicleta; //Identificador da bicileta
	protected Boolean ocupacao; //A bicicleta esta em uso ou livre
	protected Integer idadeBicicleta; //Tempo de vida da bicicleta
	protected Integer tipoBicicleta; //Tipo da bicicleta = eletrica (0) ou normal (1)
	
	public Bicicleta(Integer idBicicleta, Boolean ocupacao, Integer idadeBicicleta, Integer tipoBicicleta) { //constructor do objeto bicicleta
		super();
		this.idBicicleta = idBicicleta;
		this.ocupacao = ocupacao;
		this.idadeBicicleta = idadeBicicleta;
		this.tipoBicicleta = tipoBicicleta;
	}

	public Integer getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(Integer idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

	public Boolean getEstadoUso() {
		return ocupacao;
	}

	public void setEstadoUso(Boolean estadoUso) {
		this.ocupacao = estadoUso;
	}

	public Integer getIdadeBicicleta() {
		return idadeBicicleta;
	}

	public void setIdadeBicicleta(Integer idadeBicicleta) {
		this.idadeBicicleta = idadeBicicleta;
	}
	
	public Integer getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta(Integer tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}

}