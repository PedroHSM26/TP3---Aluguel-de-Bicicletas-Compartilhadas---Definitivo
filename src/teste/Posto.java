package teste;

public class Posto {
	private BicicletaEletrica[]  bicicleta_eletrica = new BicicletaEletrica[5];
	private BicicletaNormal[]  bicicleta_normal = new BicicletaNormal[5];
	private	int espacosDisponiveis;
	private Usuario usuario;
	private int numBicicletas;
	
	public Posto(BicicletaEletrica be, BicicletaNormal bn, int ed, Usuario u, int numB) {
		espacosDisponiveis = ed;
	}
}
