package teste;

public class BicicletaEletrica extends Bicicleta {
	private int energia;

	public BicicletaEletrica() {
		super();
	}
	
// Também Colocar aqui os atributos e métodos da classe abstrata Bicicleta usando this
	public BicicletaEletrica(int e,int idBicicletaElec, boolean state,Double usage, int age, String qRCode) {
		energia = e;
		idBicicleta = idBicicletaElec;
		estadoUso = state;
		tempoUso = usage;
		idadeBicicleta = age;
		qrCode = qRCode;
	}
	
	
	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
}
