package teste;

public class PlanoAssinatura {
	 private int valor;
	 private String tipoDePlano;
	 private String metodoPagamento;
	 private Usuario usuario;
	
	 public PlanoAssinatura(int v, String planType, String paymentMethod, Usuario user) {
		 valor = v;
		 tipoDePlano = planType;
		 metodoPagamento = paymentMethod;
		 usuario = user;
	 }
	 
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	 
	 
	 
}

