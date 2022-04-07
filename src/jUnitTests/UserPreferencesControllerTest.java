package jUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.junit.jupiter.api.Test;

import controle.PostoController;
import controle.UserPreferencesController;
import modelo.Usuario;

/**
 * 
 * @author Juan Mangueira
 * <h2>
 * UserPreferenceControllerTest 
 *</h2>
 *<span>
 * Teste de controle de preferencias do usuario
 * Retorna true caso o usuario consiga abrir o painel de editar os dados e deletar a conta
 * 
 * O teste e realizado utilizando um usuario com dados devidamente preenchidos, dois botoes e uma lista de usuarios
 * 
 *</span>
 */

class UserPreferencesControllerTest {


	JFrame jf = new JFrame();
	Usuario usr = new Usuario("pedro@email.com", "123", "pedro",
			"brasileiro", "Bicicleta Normal", "40028922","30434-23423");
	UserPreferencesController UP = new UserPreferencesController();
	JButton login = new JButton();
	JButton cadastro = new JButton();
	LinkedList<Usuario> users = new LinkedList<Usuario>();
	
	
	@Test
	void deveRetornarTrueCasoPostoControllerEstejaFuncionando() {
		users.add(usr);
		/**
		 * O motivo pelo qual é passado botões neste metodo se dá por conta
		 * do método ser o responsável pela "reinicialização" do programa
		 * quando um usuário é deletado
		 */
		
		Boolean preferencias = UP.showPreferences(jf, usr,users , cadastro, login);
		assertEquals(true, preferencias);
	}

}