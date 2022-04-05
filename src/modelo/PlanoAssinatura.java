package modelo;

public class PlanoAssinatura {
	 private String tipoPlano; //Plano de bicicleta eletrica ou plano de bicicleta normal
	
	
	 
	public PlanoAssinatura(String tipoPlano) {
		super();
		
		this.tipoPlano = tipoPlano;
		
	}

	public String getTipoPlano() {
		return tipoPlano;
	}

	public void setTipoPlano(String tipoDePlano) {
		this.tipoPlano = tipoDePlano;
	}

	 
}
