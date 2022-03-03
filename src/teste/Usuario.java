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
	private Posto posto;
	
	public Usuario(String mail, String password, String name, String nac) {
		
		email = mail;
		senha = password;
		nomeCompleto = name;
		nacionalidade = nac;
	}
	
	public Usuario(String mail, String password, String name, String nac, Date nasc, Long id, 
			int cPF, Telefone num, PlanoAssinatura plano, Posto p) {
											
		email = mail;
		senha = password;
		nomeCompleto = name;
		nacionalidade = nac;
		idUsuario = id;
		cpf = cPF;
		this.numTel = num; 
		this.planoAssinado = plano;
		this.posto = p;
		
	}
	// Métodos para assinar um plano
	public void assinarPlanoBicEletric() {
		 PlanoAssinatura plano = this.getPlanoAssinado();
		 plano.setTipoDePlano("Plano de Bicicleta Elétrica");
		 plano.setMetodoPagamento("Cartão ou PIX");
	 }	
	
	public void assinarPlanoBicNor() {
		 PlanoAssinatura plano = this.getPlanoAssinado();
		 plano.setTipoDePlano("Plano de Bicicleta Normal");
		 plano.setMetodoPagamento("Cartão ou PIX");
	 }
	
	
	// Método para retirar uma bicicleta e poder usá-la
	
	public void retirarBicicleta() {
		int qtd;
		BicicletaEletrica[] arrayBikes;
		Posto p = this.getPosto();
		PlanoAssinatura plano = this.getPlanoAssinado(); // !!!! Buscar arrumar este método para ele conseguir influenciar no array de bicicletas.
		if (plano.getTipoDePlano() == "Plano de Bicicleta Elétrica") {
			qtd = p.getEspacosOcupados();
			arrayBikes = p.getBicicletas_eletricas();
			p.setBicicletas_eletricas(Bicicletas_eletricas.pop());
			p.setEspacosOcupados(qtd-1);
		}
		else {
			qtd = p.getEspacosOcupados();
			p.setBicicletas_normais(null);
			p.setEspacosOcupados(qtd-1);
		}
	}
	
	// Método para devolver uma bicicleta ao Posto.
	public void devolverBicicleta() {
		int qtd;
		int qtdBikeE;
		int qtdBikeN;
		PlanoAssinatura plano = this.getPlanoAssinado();
		Posto p = this.getPosto();
		if (p.getEspacosOcupados() < 10) {
			qtd = p.getEspacosOcupados();
			p.setEspacosOcupados(qtd+1);
			if (plano.getTipoDePlano() == "Plano de Bicicleta Elétrica") {
				qtdBikeE = p.getBicicletas_eletricas();
				p.setBicicletas_eletricas(qtdBikeE+1);
			}
			else {
				qtdBikeN = p.getBicicletas_normais();
				p.setBicicletas_normais(qtdBikeN+1);
			}
			
		}
	}
	
	
	// Gets e Sets do Objeto Usuário
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
	
	public Telefone getNumTel() {
		return numTel;
	}
	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}
	public Posto getPosto() {
		return posto;
	}
	public void setPosto(Posto posto) {
		this.posto = posto;
	}
}
