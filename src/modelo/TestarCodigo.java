package modelo;

import java.util.LinkedList;
import java.util.Scanner;

public class TestarCodigo {
	
	static Scanner sc1 = new Scanner(System.in);
	public static void main(String[] args) {
		
		BicicletaNormal[] bikeN  = new BicicletaNormal[5];
		BicicletaEletrica[] bikeE = new BicicletaEletrica[5];
		Posto posto = new Posto("", 0);
		
		bikeN[0] = new BicicletaNormal(1, true, 34.0, 4, 7, posto);
		bikeN[1] = new BicicletaNormal(1, true, 34.0, 4, 7, posto);
		bikeN[2] = new BicicletaNormal(1, true, 34.0, 4, 7, posto);
		bikeN[3] = new BicicletaNormal(1, true, 34.0, 4, 7, posto);
		bikeN[4] = new BicicletaNormal(1, true, 34.0, 4, 7, posto);
		
		bikeE[0] = new BicicletaEletrica(1, true, 34.0, 4, 7, posto);
		bikeE[1] = new BicicletaEletrica(1, true, 34.0, 4, 7, posto);
		bikeE[2] = new BicicletaEletrica(1, true, 34.0, 4, 7, posto);
		bikeE[3] = new BicicletaEletrica(1, true, 34.0, 4, 7, posto);
		bikeE[4] = new BicicletaEletrica(1, true, 34.0, 4, 7, posto);
		
		Posto posto1 = new Posto("Belford Roxo", bikeN.length + bikeE.length );
		
		LinkedList<Usuario> usr = new LinkedList<Usuario>();
		
		System.out.println("Bem vindo ao Aluguel de bicicletas compartilhadas");
		System.out.println("1- Cadastrar");
		System.out.println("2- Logar");
		Integer escolha = sc1.nextInt();
		
		while (escolha == 1) {
			System.out.println("------------Dados Pessoais------------");
			System.out.println("Digite o e-mail:");
			String email = sc1.next();
			System.out.println("Digite a senha:");
			String senha = sc1.next();
			System.out.println("Digite o nome completo:");
			String nome = sc1.next();
			sc1.nextLine();
			System.out.println("Digite a nacionalidade:");
			String nacionalidade = sc1.next();
			
			System.out.println("---------------Telefone----------------");
			System.out.println("digite seu DDI (identificador internacional): ");
			Integer ddi = sc1.nextInt();
			System.out.println("Digite seu DDD (identificador nacional):");
			Integer ddd = sc1.nextInt();
			System.out.println("Digite seu telefone:");
			Integer tel = sc1.nextInt();
			
			System.out.println("Voce prefere o plano de:");
			System.out.println("1- Bicicletas Eletricas");
			System.out.println("2- Bicicletas normais");
			Integer escolhaPlano = sc1.nextInt();
			
			if(escolhaPlano == 1) {
				PlanoAssinatura planoEletrico = new PlanoAssinatura(40, "Plano de Bicicleta Eletrica", "Cartao ou PIX");
				Telefone t1 = new Telefone(ddi, ddd, tel);
				Usuario u1 = new Usuario(email, senha, nome, nacionalidade, planoEletrico, t1);
				
				usr.add(u1);
				System.out.println("Usuario "+ u1.getNomeCompleto() + " Cadastrado com sucesso");
				escolha = 2;
			}else if(escolhaPlano == 2) {
				PlanoAssinatura planoNormal = new PlanoAssinatura(40, "Plano de Bicicleta Normal", "Cartao ou PIX");
				Telefone t1 = new Telefone(ddi, ddd, tel);
				Usuario u1 = new Usuario(email, senha, nome, nacionalidade, planoNormal, t1);
				usr.add(u1);
				System.out.println("Usuario "+ u1.getNomeCompleto() + " Cadastrado com sucesso");
				escolha = 2;
			}else {
				System.out.println("Op��o escolhida diferente ");
			}
			
		}
		
		System.out.println("");
		System.out.println("Digite seu login:");
		String login = sc1.next();
		System.out.println("Digite sua senha:");
		String passwd = sc1.next();
		
	
		for(Integer i = 0; i < usr.size(); i++) {
			if(usr.get(i).getEmail().equals(login)) {
				System.out.println("Usuario logado com sucesso");
				System.out.println("");
				System.out.println("O que voc� deseja fazer?");
				System.out.println("1- Retirar bicicleta");
				System.out.println("2- Devolver bicicleta");
				System.out.println("3- Informa��es da sua conta");
				System.out.println("4- Deletar conta");
				Integer escolhaAcao = sc1.nextInt();
				
				while(escolhaAcao == 1 || escolhaAcao == 2 || escolhaAcao == 3 || escolhaAcao == 4) {
					if(escolhaAcao == 1) {
						posto1.retirarBicicleta();
						
						System.out.println("------------------------------------");
						System.out.println(" ");
						System.out.println("O que voc� deseja fazer agora?");
						System.out.println("2- Devolver bicicleta");
						System.out.println("3- Informa��es da sua conta");
						System.out.println("4- deletar sua conta ");
						escolhaAcao = sc1.nextInt();
					}else if(escolhaAcao == 2) {
						posto1.devolverBicicleta();
						System.out.println("------------------------------------");
						System.out.println(" ");
						System.out.println("O que você deseja fazer agora?");
						System.out.println("1- Retirar bicicleta");
						System.out.println("3- Informa��es da sua conta");
						System.out.println("4- deletar sua conta ");
						escolhaAcao = sc1.nextInt();
					}else if(escolhaAcao == 3){
						System.out.println("Você deseja saber suas informa��es:");
						System.out.println("1- De cadastro");
						System.out.println("2- De telefone");
						Integer escolhaInfo = sc1.nextInt();
						if(escolhaInfo == 1) {
							usr.get(i).informacoesUsuario(1);
							System.out.println("----------------------");
							System.out.println("O que voc� deseja fazer?");
							System.out.println("1- Retirar bicicleta");
							System.out.println("2- Devolver bicicleta");
							System.out.println("3- Informa��es da sua conta");
							System.out.println("4- Deletar conta");
							escolhaAcao = sc1.nextInt();
						}else if(escolhaInfo == 2) {
							usr.get(i).informacoesUsuario();
							System.out.println("----------------------");
							System.out.println("O que voc� deseja fazer?");
							System.out.println("1- Retirar bicicleta");
							System.out.println("2- Devolver bicicleta");
							System.out.println("3- Informa��es da sua conta");
							System.out.println("4- Deletar conta");
							escolhaAcao = sc1.nextInt();
						}else {
							System.out.println("Op��o invalida");
							System.out.println("");
							System.out.println("O que voc� deseja fazer?");
							System.out.println("1- Retirar bicicleta");
							System.out.println("2- Devolver bicicleta");
							System.out.println("3- Informa��es da sua conta");
							System.out.println("4- Deletar conta");
							escolhaAcao = sc1.nextInt();
						}
						
					}else if(escolhaAcao == 4) {
						usr.remove(i);
						System.out.println("Conta deletada");
						break;
						
					}
					
					
				}
				
				System.out.println("Programa finalizado");
				
				
			}else {
				System.out.println("usuario inexistente");
			}
		}
			
	}

}