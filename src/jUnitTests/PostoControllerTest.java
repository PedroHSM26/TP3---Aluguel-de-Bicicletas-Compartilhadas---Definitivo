package jUnitTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import javax.swing.JFrame;

import org.junit.jupiter.api.Test;

import controle.PostoController;
import modelo.Usuario;

/**
 * 
 * @author Juan Mangueira
 * <h2>
 * Posto controller teste
 *</h2>
 *<span>
 * Teste do controller Posto
 * Retorna true caso o posto consiga atender a funcionalidade de retirar bicicleta verificando o plano do usuario
 * 
 * O teste e realizado utilizando um usuario com dados devidamente preenchidos
 * 
 *</span>
 */

class PostoControllerTest {

	
	JFrame jf = new JFrame();
	Usuario usr = new Usuario("pedro@email.com", "123", "pedro",
			"brasileiro", "Bicicleta Normal", "40028922","30434-23423");
	PostoController p = new PostoController();
	
	@Test
	void deveRetornarTrueCasoPostoControllerEstejaFuncionando() {
		Boolean posto = p.PostoController(jf, usr);
		assertEquals(true, posto);
	}

}