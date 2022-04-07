package controle;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import modelo.Posto;
import modelo.Usuario;
/**
 * @author Juan Mangueira Alves
 * <h2>Posto Controller</h2>
 * <p>
 * classe responsável por controlar os postos de bicicletas disponíveis e os seus devidos planos
 * de assinatura
 * </p>
 *
 */
public class PostoController {

	/**
	 * Os parametros utilizados são:
	 * @param frame
	 * @param usuario
	 * <br></br>
	 * O <strong> usuario </strong> aqui é utilizado no momento da validação de qual tipo de
	 * <br>
	 * plano de assinatura ele tem cadastrado para poder retirar alguma bicicleta
	 * <br></br>
	 * O <strong>Frame</strong> é utilizado para associar o painel ao frame principal da aplicação
	 * <br>
	 * sendo que o painel do posto controller tem como elementos:
	 * <ul>
	 * 	<li>o titulo do posto</li>
	 * 	<li>a localização</li>
	 * <li>o tipo de bicicleta</li>
	 * </ul> 
	 */
	public static Boolean PostoController(JFrame frame, Usuario usuario) {
		
			JPanel p = new JPanel(new BorderLayout(10,10));
			JPanel controls = new JPanel(new GridLayout(0,1,1,2));
			JPanel labels = new JPanel(new GridLayout(0,1,2,2));
			
			
			 
			 labels.add(new JLabel("<html>Nome: <span color = #38805F >Taguatinga</span> </html>", SwingConstants.TRAILING));
		     labels.add(new JLabel("Tipo: Bicicleta Normal", SwingConstants.TRAILING));
		     p.add(labels, BorderLayout.LINE_START);
			 
		     JButton PegarT = new JButton("Pegar");
		     controls.add(PegarT);
		     
		     labels.add(new JLabel("<html>Nome: <span color = #38805F >Samambaia</span> </html>", SwingConstants.TRAILING));
		     labels.add(new JLabel("Tipo: Bicicleta Elétrica", SwingConstants.TRAILING));
		     p.add(labels, BorderLayout.LINE_START);
			 
		     JButton PegarS = new JButton("Pegar");
		     controls.add(PegarS);
		     
		     labels.add(new JLabel("<html>Nome: <span color = #38805F >Aguas Claras</span> </html>", SwingConstants.TRAILING));
		     labels.add(new JLabel("Tipo: Plus", SwingConstants.TRAILING));
		     p.add(labels, BorderLayout.LINE_START);
			 
		     JButton PegarAc = new JButton("Pegar");
		     controls.add(PegarAc);
		     
		     labels.add(new JLabel("<html>Nome: <span color = #38805F >Ceilandia</span> </html>", SwingConstants.TRAILING));
		     labels.add(new JLabel("Tipo: Bicicleta Normal", SwingConstants.TRAILING));
		     p.add(labels, BorderLayout.LINE_START);
			 
		     JButton PegarC = new JButton("Pegar");
		     controls.add(PegarC);

		     p.add(controls, BorderLayout.CENTER);
		     
		
		     frame.add(p);
		
			PegarT.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(usuario.getPlanoAssinado().equals("Bicicleta Normal") || usuario.getPlanoAssinado().equals("Plus (Normal & Elétrica)")) {
						JOptionPane.showOptionDialog(frame, "Bicicleta Retirada!", "Postos", JOptionPane.PLAIN_MESSAGE, 
								JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {}, null);
						usuario.setBicicletas(1);
					}else {
						JOptionPane.showOptionDialog(frame, "Você não assinou este plano", "Postos", JOptionPane.PLAIN_MESSAGE, 
								JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {}, null);
					}
					
				}
			});
			
			PegarS.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(usuario.getPlanoAssinado().equals("Bicicleta Elétrica")|| usuario.getPlanoAssinado().equals("Plus (Normal & Elétrica)")) {
						JOptionPane.showOptionDialog(frame, "Bicicleta Retirada!", "Postos", JOptionPane.PLAIN_MESSAGE, 
								JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {}, null);
						usuario.setBicicletas(1);
					}else {
						JOptionPane.showOptionDialog(frame, "Você não assinou este plano", "Postos", JOptionPane.PLAIN_MESSAGE, 
								JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {}, null);
					}
				}
			});
			
			PegarAc.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(usuario.getPlanoAssinado().equals("Plus (Normal & Elétrica)")) {
						JOptionPane.showOptionDialog(frame, "Bicicleta Retirada!", "Postos", JOptionPane.PLAIN_MESSAGE, 
								JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {}, null);
						usuario.setBicicletas(1);
					}else {
						JOptionPane.showOptionDialog(frame, "Você não assinou este plano", "Postos", JOptionPane.PLAIN_MESSAGE, 
								JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {}, null);
					}
				}
			});
			
			PegarC.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(usuario.getPlanoAssinado().equals("Bicicleta Normal") || usuario.getPlanoAssinado().equals("Plus (Normal & Elétrica)")) {
						JOptionPane.showOptionDialog(frame, "Bicicleta Retirada!", "Postos", JOptionPane.PLAIN_MESSAGE, 
								JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {}, null);
						usuario.setBicicletas(1);
					}else {
						JOptionPane.showOptionDialog(frame, "Você não assinou este plano", "Postos", JOptionPane.PLAIN_MESSAGE, 
								JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {}, null);
					}	
					
				}
			});
		
		
	
		JOptionPane.showOptionDialog(frame, p, "Postos", JOptionPane.PLAIN_MESSAGE, 
				JOptionPane.QUESTION_MESSAGE,
		null, new Object[] {}, null);
		return true;
	}
}
