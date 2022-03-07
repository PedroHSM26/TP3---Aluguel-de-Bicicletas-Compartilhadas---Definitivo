package teste;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestarCodigo {
	static Usuario u1;
	static Posto p1;
	static BicicletaEletrica be1;
	static BicicletaNormal bn1;
	static Telefone t;
	static PlanoAssinatura pa;
	
	public static void main(String[] args) {
		u1 = new Usuario("pedroarroba","senhaDois", "Pedro Henrique da Silva Melo ", "brasileiro");

		GregorianCalendar d = new GregorianCalendar();
		Date agora = d.getTime();
		
		t = new Telefone(61984, 61, 55);
		t.setDdd(661);
		t.setNumero(333333);
		
		System.out.println(u1.toString()); // Est� imprimindo o hashcode do objeto,assistir video da prof sobre conceitos estruturais
		System.out.println(agora.toString()); //Vai ter q ir no objeto u1 e escrever o toString l�!
		System.out.println(t.toString());
	}

}
