package teste;

public class BicicletaNormal extends Bicicleta {
	private int marcha;
	
	public BicicletaNormal() {
		super();
	}
	
	// Tamb�m Colocar aqui os atributos e m�todos da classe abstrata Bicicleta usando this
	public BicicletaNormal(int m, int idBicicletaNor, boolean state,Double usage, int age, String qRCode) {
		marcha = m;
		idBicicleta = idBicicletaNor;
		estadoUso = state;
		tempoUso = usage;
		idadeBicicleta = age;
		qrCode = qRCode;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
}
