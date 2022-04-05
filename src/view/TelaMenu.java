package view;

//import java.util.LinkedList;
//import java.util.Scanner;

//import modelo.BicicletaEletrica;
//import modelo.BicicletaNormal;
//import modelo.PlanoAssinatura;
//import modelo.Posto;
//import modelo.Usuario;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import controle.*;

public class TelaMenu implements ActionListener {
		private static JFrame janela = new JFrame("Controle de Bicicletas Compartilhadas");
		private static JLabel titulo = new JLabel("Menu Principal");
		private static JButton posto = new JButton("Postos");
		private static JButton usuario = new JButton("Usuarios");
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		usuario.setBounds(140, 100, 100, 30);
		posto.setBounds(140, 50, 100, 30);

		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(posto);
		janela.add(usuario);
		
		janela.setSize(400,250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
		
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		// Se��o que deve ser usada quando construir a TelaPosto, TelaUsuario e TelaPlanoAssinatura
		
//		if (src == posto) {
//			new TelaPosto.mostrarDados();
//		}
		
	}

}