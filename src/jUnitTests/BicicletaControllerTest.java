package jUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.Test;

import controle.BicicletaController;
import modelo.Usuario;

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