package modelo;

public class PlanoAssinatura {
	 private Integer valor; //Valor a ser cobrado pelo plano
	 private String tipoDePlano; //Plano de bicicleta eletrica ou plano de bicicleta normal
	 private String metodoPagamento; //Em dinheiro ou cartao
	
	
	 
	public PlanoAssinatura(Integer valor, String tipoDePlano, String metodoPagamento) {
		super();
		this.valor = valor;
		this.tipoDePlano = tipoDePlano;
		this.metodoPagamento = metodoPagamento;
	}
	

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getTipoDePlano() {
		return tipoDePlano;
	}

	public void setTipoDePlano(String tipoDePlano) {
		this.tipoDePlano = tipoDePlano;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}


	 
}
