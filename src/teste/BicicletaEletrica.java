package teste;

public class BicicletaEletrica extends Bicicleta {
	private Long energia;

	public BicicletaEletrica() {
		super();
	}
	
	//Sobrecarga
	public BicicletaEletrica(Long e) {
		energia = e;
	}
	
	public Long getEnergia() {
		return energia;
	}

	public void setEnergia(Long energia) {
		this.energia = energia;
	}
}
