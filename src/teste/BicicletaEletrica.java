package teste;

public class BicicletaEletrica extends Bicicleta {
	private Long energia;

	public BicicletaEletrica() {
		super();
	}
	
// Também Colocar aqui os atributos e métodos da classe abstrata Bicicleta usando this
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
