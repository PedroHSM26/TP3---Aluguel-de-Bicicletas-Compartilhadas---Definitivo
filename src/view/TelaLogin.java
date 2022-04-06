package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import controle.*;


public class TelaLogin implements ActionListener {
	private static JFrame janela = new JFrame("Tembixo");
	private static JLabel titulo = new JLabel("Login de Usuário");
	private static JLabel labelEmail = new JLabel("E-mail:");
	private static JLabel labelSenha = new JLabel("Senha:");
	private static JTextField valorEmail = new JTextField();
	private static JTextField valorSenha = new JTextField();
	private static JButton anterior = new JButton("Voltar");
	private static JButton logar = new JButton("Logar");
	
	
	public TelaLogin() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(200, 10, 250, 30);
		labelEmail.setBounds(140, 40, 150, 30);
		labelSenha.setBounds(140, 130, 150, 30);
		valorEmail.setBounds(140, 70, 320, 35);
		valorSenha.setBounds(140, 160, 320, 35);
		anterior.setBounds(140, 200, 160, 40);
		logar.setBounds(300, 200, 160, 40);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(labelEmail);
		janela.add(labelSenha);
		janela.add(valorEmail);
		janela.add(valorSenha);
		janela.add(anterior);
		janela.add(logar);
		
		janela.setSize(800,500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		// Secao que deve ser usada quando construir a TelaPosto, TelaUsuario e TelaPlanoAssinatura
		
//		if (src == posto) {
//			new TelaPosto.mostrarDados();
//		}
		
	}
	
}
