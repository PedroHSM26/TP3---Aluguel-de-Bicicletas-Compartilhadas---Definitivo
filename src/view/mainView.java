package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controle.BicicletaController;
import controle.MainController;
import controle.PostoController;
import controle.UserPreferencesController;
import modelo.Usuario;

/**
 * View principal do programa de bicicletas compartilhadas
 * @author Pedro Henrique
 * @version 1.0
 * @since Release 05/04
 * 
 */

public class mainView {

	/**
	 * <h2> Atributos para inicialização do programa </h2>
	 * @param usr - lista de usuarios que o programa carrega ao iniciar
	 * @param MainController- Controller principal da aplicação, responsavel pelo registro e login dos usuarios
	 * @param BicicletaController - controller responsável pela devolução das bicicletas
	 * @param postoController - controller responsavel pela retirada das bicicletas
	 * @param usuario - inicialização do usuario "vazio", aquele que receberá dados para o login
	 * @param localDate - responsavel por captar a data de hoje
	 * @param DateTimerFormater - responsavel por formatar a data para o padrão brasileiro
	 * 
	 */
	static LinkedList<Usuario> usr = new LinkedList<Usuario>();
	public static MainController mainControler;
	public static UserPreferencesController userPreferences;
	public static BicicletaController bicicletaController;
	public static PostoController postoController;
	public static Usuario usuario = new Usuario(null, null, null, null, null, null, null);
	public static LocalDate hoje = LocalDate.now();
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	/**
	 * <h2>Inicio da interface principal</h2>
	 * <p>
	 * Aqui é inicializado o nosso programa como um todo, <br>
	 * dentro deste metodo temos: 
	 * <ul>
	 * <li>a chamada para o registro e login do usuário <br></li>
	 * <li>a edição de dados da conta <br></li>
	 * <li>a leitura de dados da bicicleta <br></li>
	 * <li>a remoção de bicicletas <br></li>
	 * </ul>
	 * 
	 * </p>
	 */
	public static void main(String[] args) throws IOException {
		
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Controle de Bicicletas Compartilhadas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.decode("#6F8DAF"));
		frame.setResizable(false);
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setVisible(true);

		JButton closeBtn = new JButton("Sair");
		JButton loginBtn = new JButton("Logar");
		JButton cadastroBtn = new JButton("Cadastrar");
		JButton bicicletasBtn = new JButton("Bicicletas");
		JButton editarContaBtn = new JButton("Editar dados da Conta");
		JButton retirarBicicletaBtn = new JButton("Retirar Bicicletas disponiveis");

		bicicletasBtn.setVisible(false);
		editarContaBtn.setVisible(false);
		retirarBicicletaBtn.setVisible(false);

		
		JPanel ParentPanel = new JPanel();
		ParentPanel.setBounds(0, 50, 599, 499);
		ParentPanel.setBackground(Color.decode("#E4F4F9"));

		JPanel childPanel = new JPanel();
		childPanel.setBounds(0, 50, 599, 499);
		childPanel.setBackground(Color.decode("#E4F4F9"));

		JLabel boasVindas = new JLabel("Aluguel de bicicleta compartilhada!");
		JLabel subtitulo = new JLabel("Boas Vindas ao");
		boasVindas.setFont(new Font("Serif", Font.ROMAN_BASELINE, 28));
		subtitulo.setFont(new Font("Serif", Font.ROMAN_BASELINE, 23));

		JLabel olaUsuario = new JLabel();
		
		childPanel.add(subtitulo);
		childPanel.add(boasVindas);
		ParentPanel.add(bicicletasBtn);
		ParentPanel.add(editarContaBtn);
		ParentPanel.add(retirarBicicletaBtn);
		childPanel.setVisible(true);
		frame.add(childPanel);
		frame.add(ParentPanel);

		closeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});

		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainControler.showLogin(frame, usr, usuario, loginBtn, cadastroBtn);

				// Após logar com sucesso, o painel de boas vindas some e o usuário é logado
				if (loginBtn.isVisible() == false) {
					
					
					olaUsuario.setText("<html>Painel Inicial <br></br> Seu Plano:"
							+ " <span color = #38805F >" + usuario.getPlanoAssinado() + "</span> "
							+ "<br> Data de Hoje:" + hoje.format(formatter) + "</html>");

					olaUsuario.setFont(new Font("Serif", Font.ROMAN_BASELINE, 28));
					olaUsuario.setBounds(90, 10, 120, 30);
					olaUsuario.setVisible(true);
					ParentPanel.add(olaUsuario);
					
					childPanel.setVisible(false);
					bicicletasBtn.setVisible(true);
					editarContaBtn.setVisible(true);
					retirarBicicletaBtn.setVisible(true);

				}
			}

		});

		cadastroBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainControler.showRegister(frame, usr);

			}
		});

		editarContaBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				userPreferences.showPreferences(frame, usuario, usr, loginBtn, cadastroBtn);

				if(loginBtn.isVisible()) {
					childPanel.setVisible(true);
					bicicletasBtn.setVisible(false);
					editarContaBtn.setVisible(false);
					retirarBicicletaBtn.setVisible(false);
					
				}
			}
		});

		bicicletasBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				bicicletaController.devolverBicicleta(frame, usuario);

			}
		});

		retirarBicicletaBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				postoController.PostoController(frame, usuario);

			}
		});
		
		

		// Tamanho e posicionamento dos botões
		loginBtn.setBounds(90, 10, 120, 30);
		cadastroBtn.setBounds(220, 10, 120, 30);
		closeBtn.setBounds(350, 10, 120, 30);

		// Adicionando os botões a tela
		frame.add(closeBtn);
		frame.add(loginBtn);
		frame.add(cadastroBtn);

	}
}
