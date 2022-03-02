package teste;

public class Telefone {
	private int numero;
	private int ddi;
	private int ddd;
	
	public Telefone(int num, int dDI, int dDD) {
		numero = num;
		ddi = dDI;
		ddd = dDD;
	}
	// Gets e Sets
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDdi() {
		return ddi;
	}

	public void setDdi(int ddi) {
		this.ddi = ddi;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	
}
