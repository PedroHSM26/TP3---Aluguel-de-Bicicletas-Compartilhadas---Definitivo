package modelo;

import java.util.Date;
import java.util.LinkedList;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * <h2>@Class Usuario</h2>
 * <p>Consiste no modelo da conta do usuário <br>
 * 	  Aqui nós temos:
 * </p>
 * 	<ul>
 * <li>Email</li>
 * <li>Senha</li>
 * <li>Nome completo</li>
 * <li>Nacionalidade</li>
 * <li>ID Usuario</li>
 * <li>Numero de telefone</li>
 * <li>Plano assinado</li>
 * <li>CPF</li>
 *  </ul>
 * 
 */
public class Usuario {
    
	private String email;
	private String senha;
	private String nomeCompleto;
	private String nacionalidade;
	private Long idUsuario;
	private String cpf;
	private String planoAssinado;
	private String numTel;
	private LinkedList<Integer> bicicletas = new LinkedList<Integer>();

	public Usuario(String email, String senha, String nome, String nacionalidade, String planoAssinado,
			String telefone, String cpf) {
		super();
		this.bicicletas.add(1);
		this.email = email;
		this.senha = senha;
		this.nomeCompleto = nome;
		this.nacionalidade = nacionalidade;
		this.planoAssinado = planoAssinado;
		this.numTel = telefone;
		this.cpf = cpf;

	}

	public Integer getBicicletas() {
		return this.bicicletas.size();
	}

	public void setBicicletas(Integer bicicletas) {
		this.bicicletas.add(bicicletas);
	}

	public void retirarBibicleta() {
		this.bicicletas.pop();
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	

	public String getPlanoAssinado() {
		return planoAssinado;
	}

	public void setPlanoAssinado(String planoAssinado) {
		this.planoAssinado = planoAssinado;
	}

	public void setBicicletas(LinkedList<Integer> bicicletas) {
		this.bicicletas = bicicletas;
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

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	@Override
	public String toString() {
		return "Email: " + email + "\nSenha: " + senha + "\nNome: " + nomeCompleto + "\nNacionalidade: " + nacionalidade
				+ "\n Plano:" + this.planoAssinado;
	}

	public void informacoesUsuario(Integer escolha) {
		System.out.println("Nome: " + this.nomeCompleto);
		System.out.println("Email: " + this.email);
		System.out.println("Nacionalidade: " + this.nacionalidade);
	}

	public void informacoesUsuario() {
		System.out.println("Numero de telefone: " + this.numTel);

	}

}