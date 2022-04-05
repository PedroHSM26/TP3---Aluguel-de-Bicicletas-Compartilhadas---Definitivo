package modelo;

public class Telefone { //(***)
	private Integer numero; //Digitos do telefone sem considerar ddd e ddi
	private Integer ddi; //Digitos que correspondem ao DDI (Pais)
	private Integer ddd; //DIgitos que correspondem ao DDD (Estado)
	
	
	
	public Telefone(Integer ddi, Integer ddd, Integer numero) {
		super();
		this.numero = numero;
		this.ddi = ddi;
		this.ddd = ddd;
	}

	


	public Integer getNumero() {
		return numero;
	}




	public void setNumero(Integer numero) {
		this.numero = numero;
	}




	public Integer getDdi() {
		return ddi;
	}




	public void setDdi(Integer ddi) {
		this.ddi = ddi;
	}




	public Integer getDdd() {
		return ddd;
	}




	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}




	@Override
	public String toString() {
		return ""+ ddi+ ddd+ numero +"";
	}
	
}