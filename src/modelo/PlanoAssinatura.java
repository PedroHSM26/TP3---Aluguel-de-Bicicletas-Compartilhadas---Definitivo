package modelo;

/**
 * 
 * @author Juan Mangueira ALves
 * <h2>Model Plano Assinatura</h2>
 * <br>
 * <p>
 * classe responsável pelo tipo de plano de assinatura do usuário <br>
 * Aqui temos os atributos:
 * <ul>
 * <li>tipo de plano</li>
 * <li>valor</li>
 * <li>tipo de pagamento</li>
 * </ul>
 * </p>
 *
 */
public class PlanoAssinatura {
	 private Integer valor;
	 private String tipoDePlano;
	 private String metodoPagamento;
	
	
	 
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