package modelo;

public class BicicletaNormal extends Bicicleta {
	
	private Integer tamanhoAro, qntdMarchas; // Tamanho da roda (26 ou 29); Quantidade de Marchas (1 ate 6)
	
	public BicicletaNormal(Integer idBicicleta, Boolean ocupacao, Integer tipoBicicleta, Posto posto, Integer tamanhoAro, Integer qntdMarchas) {
		super(idBicicleta, ocupacao, tipoBicicleta);
		this.setTamanhoAro(tamanhoAro);
		this.setQntdMarchas(qntdMarchas);
	}

	public Integer getQntdMarchas() {
		return qntdMarchas;
	}

	public void setQntdMarchas(Integer qntdMarchas) {
		this.qntdMarchas = qntdMarchas;
	}


	public Integer getTamanhoAro() {
		return tamanhoAro;
	}

	public void setTamanhoAro(Integer tamanhoAro) {
		this.tamanhoAro = tamanhoAro;
	}

}