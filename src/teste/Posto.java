package teste;

import java.util.ArrayList;

public class Posto {
	private BicicletaEletrica[]  bicicletas_eletricas = new BicicletaEletrica[5]; //Colocar até 5 bicicletas nesse array
	private BicicletaNormal[]  bicicletas_normais = new BicicletaNormal[5]; //Colocar até 5 bicicletas nesse array
	private	int espacosOcupados = 10; //Precisamos manipular esta variável de acordo com o número de bicicletas alocadas.
	private Usuario usuario;
	
	public Posto(){
	    super();
	}
	
	
	public Posto(int eo, Usuario u) {
		usuario = u;
		espacosOcupados = eo;
	}

	//Sobrecarga
	public Posto(BicicletaEletrica[] bikeElec, BicicletaNormal[] bikeNor, int eo, Usuario u) {
		usuario = u;
		espacosOcupados = eo;
		bicicletas_eletricas = bikeElec;
		bicicletas_normais = bikeNor;
	}
	
	
	
	// Analisar método getAluno e setAluno no objeto Curso do exemplo da prof
	
	
	
		public BicicletaEletrica[] getBicicletaEletrica() {
			
			return bicicletas_eletricas;
		}
		
//		public static int[] getBicicletaEletrica() {
			
			
//			ArrayList<BicicletaEletrica> bicicletas_eletricas = new ArrayList<BicicletaEletrica>();
//			
//			bicicletas_eletricas.add();
//			bicicletas_eletricas.add(2);
//			bicicletas_eletricas.add(3);
//			bicicletas_eletricas.add(4);
//			bicicletas_eletricas.add(5);
//			
//		}
			
//			int[] bicicletas_eletricas = new int[5];
//
//	        for (int i = 0; i < bicicletas_eletricas.length; i++) {
//	             bicicletas_eletricas[i] = i;
//	        }
//	        return bicicletas_eletricas;		
//		}
		
	public void setBicicletas_eletricas(BicicletaEletrica [] bicicletas_eletricas) {
		this.bicicletas_eletricas = bicicletas_eletricas;
	}


	public BicicletaNormal[] getBicicletas_normais() {
		return bicicletas_normais;
	}


	public void setBicicletas_normais(BicicletaNormal[] bicicletas_normais) {
		this.bicicletas_normais = bicicletas_normais;
	}
	
	public int getEspacosOcupados() {
		return espacosOcupados;
	}


	public void setEspacosOcupados(int espacosOcupados) {
		this.espacosOcupados = espacosOcupados;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
