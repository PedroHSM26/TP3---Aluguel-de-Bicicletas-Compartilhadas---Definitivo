package modelo;

import java.util.Date;

public class Usuario {
	
	private String email;
	private String senha;
	private String nomeCompleto;
	private String nacionalidade;
	private Date dataNascimento ;
	private Long idUsuario ;
	private Integer cpf;
	private PlanoAssinatura planoAssinado;
	private Telefone numTel;
	
	
	public Usuario(String email, String senha, String nomeCompleto, String nacionalidade,
			PlanoAssinatura planoAssinado, Telefone telefone) {
		super();
		this.email = email;
		this.senha = senha;
		this.nomeCompleto = nomeCompleto;
		this.nacionalidade = nacionalidade;
		this.planoAssinado = planoAssinado;
		this.numTel = telefone;
	
	}

	
	
	public void retirarBicicleta(Integer qnt,Posto posto) {
		if(posto.getTotalBicicletas() != 0) {
			posto.setTotalBicicletas(-qnt);
			System.out.println("Você retirou uma bicicleta do Posto de "+ posto.getLocalizacao());
			System.out.println("Agora restam " + posto.getTotalBicicletas() + " bicicletas restantes");
		}else {
			System.out.println("Não há¡ bicicletas a serem retiradas");
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



	public String getNacionalidade() {
		return nacionalidade;
	}



	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}



	public Date getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public Long getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}



	public Integer getCpf() {
		return cpf;
	}



	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}



	public PlanoAssinatura getPlanoAssinado() {
		return planoAssinado;
	}



	public void setPlanoAssinado(PlanoAssinatura planoAssinado) {
		this.planoAssinado = planoAssinado;
	}



	public Telefone getNumTel() {
		return numTel;
	}



	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}



	@Override
	public String toString() {
		return "Email: " + email + "\nSenha: " + senha + "\nNome: " + nomeCompleto + "\nNacionalidade: "
				+ nacionalidade;
	}
	
	public void informacoesUsuario(Integer escolha) {
		System.out.println("Nome: "+ this.nomeCompleto);
		System.out.println("Email: "+ this.email);
		System.out.println("Nacionalidade: "+ this.nacionalidade);
	}
	
	public void informacoesUsuario() {
		System.out.println("Numero de telefone: "+ this.numTel);
	
	}
	
}