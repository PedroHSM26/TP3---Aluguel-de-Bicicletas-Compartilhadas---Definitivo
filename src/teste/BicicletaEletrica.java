package teste;

public class BicicletaEletrica extends Bicicleta {
	private Long energia;

	public BicicletaEletrica() {
		super();
	}
	
// Tamb�m Colocar aqui os atributos e m�todos da classe abstrata Bicicleta
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
