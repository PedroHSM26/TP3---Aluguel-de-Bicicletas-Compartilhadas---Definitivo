package controle;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import modelo.Usuario;
/**
 * 
 * @author Juan Mangueira alves
 *<h2>User Preferences controller</h2>
 *<br>
 *<p>Classe responsavel pela edicao de dados do usuario</p>
 *<br>
 *Aqui o usuario pode editar:
 *<ul>
 *<li>Nome</li>
 *<li>Nacionalidade</li>
 *<li>Email</li>
 *<li>Senha</li>
 *<li>Telefone</li>
 *<br>
 *Contudo o usuario nao pode mudar de plano escolhido
 *</ul>
 */
public class UserPreferencesController {

	public static boolean showPreferences(JFrame frame,Usuario usuario, LinkedList<Usuario> usr, JButton loginBtn,JButton cadastroBtn) {


	     
	     JButton EditarDadosBtn = new JButton("Editar Dados");
	     
		 JPanel p = new JPanel(new BorderLayout(10,10));
		
		 JPanel labels = new JPanel(new GridLayout(0,1,2,2));
		 labels.add(new JLabel("Nome:", SwingConstants.TRAILING));
	     labels.add(new JLabel("Nacionalidade:", SwingConstants.TRAILING));
	     labels.add(new JLabel("Email:", SwingConstants.TRAILING));
	     labels.add(new JLabel("Senha:", SwingConstants.TRAILING));
	     labels.add(new JLabel("Telefone:", SwingConstants.TRAILING));
	     labels.add(new JLabel("Plano:", SwingConstants.TRAILING));
	     labels.add(new JLabel("", SwingConstants.TRAILING));
	     labels.add(new JLabel("", SwingConstants.TRAILING));
	     p.add(labels, BorderLayout.LINE_START);
		 p.add(EditarDadosBtn);
		 
		 JPanel controls = new JPanel(new GridLayout(0,1,2,2));
	     JTextField nome = new JTextField(usuario.getNomeCompleto());
	     controls.add(nome);
	     JTextField nacionalidade = new JTextField(usuario.getNacionalidade());
	     controls.add(nacionalidade);
	     JTextField email = new JTextField(usuario.getEmail());
	     controls.add(email);
	     JPasswordField password = new JPasswordField(usuario.getSenha());
	     controls.add(password);
	     JTextField telefone = new JTextField(usuario.getNumTel());
	     controls.add(telefone);

	     p.add(controls, BorderLayout.CENTER);
	     
	     JButton atualizarBtn = new JButton("Atualizar");
	     JButton DeletarContaBtn = new JButton("Deletar Conta");
	     
	     atualizarBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					usuario.setEmail(email.getText());
					usuario.setNacionalidade(nacionalidade.getText());
					usuario.setSenha(password.getText());
					usuario.setNumTel(telefone.getText());
					usuario.setNomeCompleto(nome.getText());
					
					
								JOptionPane.showOptionDialog(frame,
				                "Dados do usuario atualizados com sucesso","",
				                JOptionPane.PLAIN_MESSAGE,
				                JOptionPane.QUESTION_MESSAGE,
				                null, new Object[]{}, null);
								JComponent comp = (JComponent) e.getSource();
								Window win = SwingUtilities.getWindowAncestor(comp);
								win.dispose();
				}
			});
	     
	    DeletarContaBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Integer i = 0;i < usr.size(); i++) {
					if(usr.get(i).getPlanoAssinado() == usuario.getPlanoAssinado()) {
						usr.pop();
						
						loginBtn.setVisible(true);
						cadastroBtn.setVisible(true);
						
						System.out.println(usr);
						
						JOptionPane.showOptionDialog(frame,
				                "Usuario deletado com sucesso","",
				                JOptionPane.PLAIN_MESSAGE,
				                JOptionPane.QUESTION_MESSAGE,
				                null, new Object[]{}, null);
						JComponent comp = (JComponent) e.getSource();
						Window win = SwingUtilities.getWindowAncestor(comp);
						win.dispose();
					}
					
				}
			}
		});
	        
	        
	    controls.add(atualizarBtn);
	    controls.add(DeletarContaBtn);
        JOptionPane.showOptionDialog(frame,
                p,"Dados do usu�rio",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{}, null);
        return true;
	}
}
