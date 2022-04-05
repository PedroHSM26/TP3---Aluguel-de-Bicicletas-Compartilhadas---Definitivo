package modelo;

public class Usuario {
	
	private String email; //Email do usuario no formato email@email.com do usuario
	private String senha; //Senha do usuario sem limitacao de tamanho ou tipo de caracter do usuario
	private String nomeCompleto; //Nome completo do usuario
	private Long idUsuario; //Identificador do usuario
	private PlanoAssinatura planoAssinado; //Plano que foi assinado pelo usuario
	
	
	public Usuario(String email, String senha, String nomeCompleto,
			PlanoAssinatura planoAssinado) {
		super();
		this.email = email;
		this.senha = senha;
		this.nomeCompleto = nomeCompleto;
		this.planoAssinado = planoAssinado;
	
	}

	
	
	public void retirarBicicleta(Integer qnt,Posto posto) { //Metodo de retirada de bicicleta do posto (***)
		if(posto.getTotalBicicletas() != 0) {
			posto.setTotalBicicletas(-qnt);
			System.out.println("Voce retirou uma bicicleta do Posto de "+ posto.getLocalizacao());
			System.out.println("Agora restam " + posto.getTotalBicicletas() + " bicicletas restantes");
		}else {
			System.out.println("Nao ha bicicletas a serem retiradas");
		}
		
	}
	

	public void devolverBicicleta(Posto posto) {
		posto.setTotalBicicletas(+1);
	}
	

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getNomeCompleto() {
		return nomeCompleto;
	}



	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}



	public Long getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public PlanoAssinatura getPlanoAssinado() {
		return planoAssinado;
	}



	public void setPlanoAssinado(PlanoAssinatura planoAssinado) {
		this.planoAssinado = planoAssinado;
	}


	@Override
	public String toString() {
		return "Email: " + email + "\nSenha: " + senha + "\nNome: " + nomeCompleto;
	}
	
	public void informacoesUsuario(Integer escolha) {
		System.out.println("Nome: "+ this.nomeCompleto);
		System.out.println("Email: "+ this.email);
	}
	
}