package teste;

import java.util.Date;

public class Usuario {
	
	private String email;
	private String senha;
	private  String nomeCompleto;
	private String nacionalidade;
	private Date dataNascimento ;
	private Long idUsuario ;
	private int cpf;
	private PlanoAssinatura planoAssinado;
	private Telefone numTel;
	
	public Usuario(String mail, String password, String name, String nac, Date nasc, Long id, 
			int cPF, Telefone num, PlanoAssinatura plano) {
											
		email = mail;
		senha = password;
		nomeCompleto = name;
		nacionalidade = nac;
		idUsuario = id;
		cpf = cPF;
		this.numTel = num; 
		this.planoAssinado = plano;
		
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public PlanoAssinatura getPlanoAssinado() {
		return planoAssinado;
	}

	public void setPlanoAssinado(PlanoAssinatura planoAssinado) {
		this.planoAssinado = planoAssinado;
	}

	public Telefone getTel() {
		return numTel;
	}

	public void setTel(Telefone tel) {
		this.numTel = tel;
	}
}
