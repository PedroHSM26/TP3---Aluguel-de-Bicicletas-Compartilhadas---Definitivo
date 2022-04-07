package modelo;

/**
 * 
 * @author Pedro Henrique
 * <br>
 * <h2>classe posto</h2>
 * <p>Responsável por ser o modelo representativo do posto</p>
 * <br>
 * Nela temos:
 * <ul>
 * 	<li>localização</li>
 * <li>total de bicicletas</li>
 * <li>Tipo de bicicleta</li>
 * </ul>
 */
public class Posto {
	
	private String localizacao;
	private Integer totalBicicletas;
	private String tipoDeBicicleta;
	
	public Posto(String localizacao, Integer totalBicicletas, String tipo) {
		super();
		this.localizacao = localizacao;
		this.totalBicicletas = totalBicicletas;
		this.tipoDeBicicleta = tipo;
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

	public String getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	
	
}