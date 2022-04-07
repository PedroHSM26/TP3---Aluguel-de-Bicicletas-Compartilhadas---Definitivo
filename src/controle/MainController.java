package controle;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import modelo.PlanoAssinatura;
import modelo.Usuario;

/**
 * 
 * @author Pedro Henrique
 * <h2>Main controller</h2>
 * <p>Classe responsável por cadastrar usuario e verificar o login</p>
 * <br>
 * Nela temos os metodos:
 * <ul>
 * 	<li>showLogin</li>
 *  <li>showRegister</li>
 * </ul>
 * 
 * <h3>O método Show Login</h3>
 * <p>É responsável por ler a lista existente de usuários e 
 * validar se os dados passados conferem com algum usuário cadastrado, caso o retorno seja
 * <br>
 * verdadeiro, o método irá passar os dados para a interface principal do programa
 * </p>
 * <h3>O método Show Register</h3>
 * <p>É responsável por cadastrar os usuários na lista do programa <br>
 * podendo realizar mais de um cadastro, adicionando assim vários usuários
 * </p>
 */

public class MainController {

	public static void showLogin(JFrame frame, LinkedList<Usuario> usr, Usuario usuario, JButton btn1, JButton btn2) {
		JPanel p = new JPanel(new BorderLayout(10, 10));

		JPanel labels = new JPanel(new GridLayout(0, 1, 2, 2));
		labels.add(new JLabel("Email", SwingConstants.TRAILING));
		labels.add(new JLabel("Senha", SwingConstants.TRAILING));
		labels.add(new JLabel("", SwingConstants.TRAILING));
		p.add(labels, BorderLayout.LINE_START);

		JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
		JTextField email = new JTextField("");
		controls.add(email);
		JPasswordField password = new JPasswordField();
		controls.add(password);
		p.add(controls, BorderLayout.CENTER);

		JButton logarBtn = new JButton("Logar");
		logarBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (Integer i = 0; i < usr.size(); i++) {
					if (usr.get(i).getEmail().equals(email.getText())
							&& usr.get(i).getSenha().equals(password.getText())) {
						btn1.setVisible(false);
						btn2.setVisible(false);

						usuario.setNomeCompleto(usr.get(i).getNomeCompleto());
						usuario.setNacionalidade(usr.get(i).getNacionalidade());
						usuario.setNumTel(usr.get(i).getNumTel());
						usuario.setPlanoAssinado(usr.get(i).getPlanoAssinado());
						usuario.setEmail(usr.get(i).getEmail());
						usuario.setSenha(usr.get(i).getSenha());

						JOptionPane.showOptionDialog(frame, "Usuário logado", "", JOptionPane.PLAIN_MESSAGE,
								JOptionPane.QUESTION_MESSAGE, null, new Object[] {}, null);
						JComponent comp = (JComponent) e.getSource();
						Window win = SwingUtilities.getWindowAncestor(comp);
						win.dispose();

					} else {
						JOptionPane.showOptionDialog(frame, "Dados Incorretos", "Login error",
								JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, new Object[] {}, null);
					}
				}

			}
		});

		controls.add(logarBtn);
		JOptionPane.showOptionDialog(frame, p, "Logar", JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {}, null);

	};

	public static void showRegister(JFrame frame, LinkedList<Usuario> usr) {
		JPanel p = new JPanel(new BorderLayout(5, 5));

		JPanel labels = new JPanel(new GridLayout(0, 1, 2, 2));
		labels.add(new JLabel("Nome", SwingConstants.TRAILING));
		labels.add(new JLabel("Nacionalidade", SwingConstants.TRAILING));
		labels.add(new JLabel("Email", SwingConstants.TRAILING));
		labels.add(new JLabel("Senha", SwingConstants.TRAILING));
		labels.add(new JLabel("Telefone", SwingConstants.TRAILING));
		labels.add(new JLabel("CPF", SwingConstants.TRAILING));
		labels.add(new JLabel("Plano", SwingConstants.TRAILING));
		labels.add(new JLabel("", SwingConstants.TRAILING));
		labels.add(new JLabel("", SwingConstants.TRAILING));
		labels.add(new JLabel("", SwingConstants.TRAILING));
		
		p.add(labels, BorderLayout.LINE_START);

		JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
		JTextField nome = new JTextField("");
		controls.add(nome);
		JTextField nacionalidade = new JTextField("");
		controls.add(nacionalidade);
		JTextField email = new JTextField("");
		controls.add(email);
		JPasswordField password = new JPasswordField();
		controls.add(password);
		JTextField telefone = new JTextField("");
		controls.add(telefone);
		JTextField cpf = new JTextField("");
		controls.add(cpf);
		JRadioButton planoNormal = new JRadioButton("Plano Normal");
		JRadioButton planoEletrico = new JRadioButton("Plano Elétrico");
		JRadioButton planoPlus = new JRadioButton("Plano Plus");

		ButtonGroup gp = new ButtonGroup();
		gp.add(planoPlus);
		gp.add(planoEletrico);
		gp.add(planoNormal);

		controls.add(planoNormal);
		controls.add(planoEletrico);
		controls.add(planoPlus);
		p.add(controls, BorderLayout.CENTER);

		JButton cadastrarBtn = new JButton("Cadastrar");
		cadastrarBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (nome.getText().isEmpty() || email.getText().isEmpty() || password.getText().isEmpty()
						|| nacionalidade.getText().isEmpty() || telefone.getText().isEmpty()) {
					JOptionPane.showOptionDialog(frame, "Você não pode deixar campos vazios ao realizar o cadastro!",
							"erro", JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, new Object[] {},
							null);

				} else {

					if (planoNormal.isSelected()) {
						Usuario usuario = new Usuario(email.getText(), password.getText(), nome.getText(),
								nacionalidade.getText(), "Bicicleta Normal", telefone.getText(), cpf.getText());
						usr.add(usuario);
					} else if (planoEletrico.isSelected()) {
						
						
						
						Usuario usuario = new Usuario(email.getText(), password.getText(), nome.getText(),
								nacionalidade.getText(), "Bicicleta Elétrica", telefone.getText(),cpf.getText());
						usr.add(usuario);
					} else if (planoPlus.isSelected()) {
						Usuario usuario = new Usuario(email.getText(), password.getText(), nome.getText(),
								nacionalidade.getText(), "Plus (Normal & Elétrica)", telefone.getText(), cpf.getText());
						usr.add(usuario);
					}

					JOptionPane.showOptionDialog(frame, "Usuário Criado com Sucesso!", "", JOptionPane.PLAIN_MESSAGE,
							JOptionPane.QUESTION_MESSAGE, null, new Object[] {}, null);
					JComponent comp = (JComponent) e.getSource();
					Window win = SwingUtilities.getWindowAncestor(comp);
					win.dispose();
				}
			}
		});

		controls.add(cadastrarBtn);
		JOptionPane.showOptionDialog(frame, p, "Cadastrar", JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null, new Object[] {}, null);
	}

}
