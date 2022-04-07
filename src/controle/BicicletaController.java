package controle;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import modelo.Usuario;

/**
 * 
 * @author Pedro Henrique
 * <h2>Bicicleta Controller</h2>
 * <br>
 * <p>Class responsável pela leitura de quantas bicicletas existem na conta do usuário e pela devolução delas</p>
 * <p>Caso o usuário não possua nenhuma bicicleta, será informado a ele sobre isso</p>
 */

public class BicicletaController {
	
	public static void panel() {
		
	}
	
	public static boolean devolverBicicleta(JFrame frame, Usuario usuario) {
		JPanel p = new JPanel();
		JPanel labels = new JPanel(new GridLayout(0,1,2,2));
		JButton devolver = new JButton("Devolver");
		JButton cancelar = new JButton("Cancelar");
		
	    if(usuario.getBicicletas() == 1) {
	    labels.add(new JLabel("<html>Você possui: "+usuario.getBicicletas() + " Bicicleta"
	    		+"<br> do tipo: <span color = #38805F >"+ usuario.getPlanoAssinado()+ " </span>"
	    		+"<br>Deseja devolver ela?"
	    		+ "</html>", SwingConstants.TRAILING));
	    	p.add(devolver);
	    	p.add(cancelar);
	    	
	    }else if(usuario.getBicicletas() > 1){
	    	 labels.add(new JLabel("<html>Você possui: "+usuario.getBicicletas() + " Bicicletas"
	 	    		+"<br> do tipo: <span color = #38805F >"+ usuario.getPlanoAssinado()+ " </span>"
	 	    		+"<br>Deseja devolvelas?"
	 	    		+ "</html>", SwingConstants.TRAILING));
	 	    	p.add(devolver);
	 	    	p.add(cancelar);
	 	    	
	    }
	    else {
	    labels.add(new JLabel("Você ainda não possui bicicletas", SwingConstants.TRAILING));
	   
	    }
	    p.add(labels, BorderLayout.LINE_START);
		
	    cancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				  JComponent comp = (JComponent) e.getSource();
				  Window win = SwingUtilities.getWindowAncestor(comp);
				  win.dispose();
			}
		});
	    
	    devolver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				usuario.retirarBibicleta();
				JOptionPane.showOptionDialog(frame,
		                "Bicicleta Retirada","",
		                JOptionPane.PLAIN_MESSAGE,
		                JOptionPane.QUESTION_MESSAGE,
		                null, new Object[]{}, null);
						 JComponent comp = (JComponent) e.getSource();
						 Window win = SwingUtilities.getWindowAncestor(comp);
						 win.dispose();
				
			}
			
		});
	    
		JOptionPane.showOptionDialog(frame,
                p,"Bicicletas",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{}, null);
		return true;
	}
}
