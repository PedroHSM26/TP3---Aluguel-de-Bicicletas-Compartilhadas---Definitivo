package modelo;

public class PlanoAssinatura {
	 private Integer valor; //Valor a ser cobrado pelo plano
	 private String tipoPlano; //Plano de bicicleta eletrica ou plano de bicicleta normal
	 private String metodoPagamento; //Em dinheiro ou cartao (***)
	
	
	 
	public PlanoAssinatura(Integer valor, String tipoPlano, String metodoPagamento) {
		super();
		this.valor = valor;
		this.tipoPlano = tipoPlano;
		this.metodoPagamento = metodoPagamento;
	}
	

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getTipoPlano() {
		return tipoPlano;
	}

	public void setTipoPlano(String tipoDePlano) {
		this.tipoPlano = tipoDePlano;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}


	 
}
