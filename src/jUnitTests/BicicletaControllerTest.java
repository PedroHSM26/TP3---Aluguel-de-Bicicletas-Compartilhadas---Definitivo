package jUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.Test;

import controle.BicicletaController;
import modelo.Usuario;
/**
 * 
 * @author Juan Mangueira
 * <h2>
 * Bicicleta controller teste
 *</h2>
 *<span>
 * Teste do controller bicicleta
 * Retorna true caso o painel bicicleta seja exibido sem erros
 * 
 * O teste e realizado utilizando um usuario qualquer e uma frame
 * 
 *</span>
 */



class BicicletaControllerTest {

	BicicletaController bc = new BicicletaController();
	JFrame jf = new JFrame();
	Usuario usr = new Usuario(null, null, null, null, null, null, null);
	
	@Test
	void deveRetornarTrueCasoBicicletaControllerEstejaFuncionando() {
		
		Boolean devolveTrue = bc.devolverBicicleta(jf, usr);
		assertEquals(true, devolveTrue);
	}

}