package modelo;

public class Telefone {
	private Integer numero;
	private Integer ddi;
	private Integer ddd;
	
	
	
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