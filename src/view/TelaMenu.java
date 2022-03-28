package view;

import java.util.LinkedList;
import java.util.Scanner;

import modelo.BicicletaEletrica;
import modelo.BicicletaNormal;
import modelo.PlanoAssinatura;
import modelo.Posto;
import modelo.Telefone;
import modelo.Usuario;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaMenu implements ActionListener {
		private static JFrame janela = new JFrame("Controle de Bicicletas Compartilhadas");
		private static JLabel titulo = new JLabel("Menu Principal");
		private static JButton bicicletas = new JButton("Bicicletas");
		private static JButton posto = new JButton("Postos disponíveis");
		private static JButton usuario = new JButton("Usuários");
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		bicicletas.setBounds(140, 100, 100, 30);
		posto.setBounds(140, 50, 100, 30);
	}
		
	public static void main(String[] args) {
	
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}