package modelo;


public class Posto {
	
	private String localizacao;
	private Integer totalBicicletas;
	
	public Posto(String localizacao, Integer totalBicicletas) {
		super();
		this.localizacao = localizacao;
		this.totalBicicletas = totalBicicletas;
	}
	
	public void retirarBicicleta() {
		if(this.getTotalBicicletas() != 0) {
			this.totalBicicletas -= 1;
			System.out.println("Você retirou uma bicicleta do Posto de "+ this.getLocalizacao());
			System.out.println("Agora restam " + this.getTotalBicicletas() + " bicicletas restantes");
		}else {
			System.out.println("Não há bicicletas a serem retiradas");
		}
		
	}
	

	public void devolverBicicleta() {
		if(this.totalBicicletas == 10) {
			System.out.println("Não há bicicletas a serem devolvidas");
		}else {
			this.totalBicicletas +=1;
			System.out.println("Você devolveu uma bicicleta ao posto");
			System.out.println("Agora o posto possui: "+ this.getTotalBicicletas() + " bicicletas restantes");
		}
		
	}
	

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Integer getTotalBicicletas() {
		return totalBicicletas;
	}

	public void setTotalBicicletas(Integer totalBicicletas) {
		this.totalBicicletas = totalBicicletas;
	}
	
	public void retiraBicicleta(Integer qnt) {
		this.totalBicicletas -= totalBicicletas;
	}
	
	
	
}