package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// declaracao de variaveis e criacao do cofre
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		int opcaoMenu = 5;
		int opcaoMoeda = 0;
		double valorRemover = 0;
		double totalConvertido = 0;
		
		while (opcaoMenu != 0) {
		
			// menu de escolhas
			System.out.println("Cofrinho de Moedas");
			System.out.println("[1] Adicionar moeda");
			System.out.println("[2] Remover moeda");
			System.out.println("[3] Listar moedas");
			System.out.println("[4] Calcular total em reais");
			System.out.println("[0] Encerrar");
			
			opcaoMenu = teclado.nextInt();
			
			
			if (opcaoMenu == 1) {
				//adicionar moedas
				System.out.println("Escolha a moeda:");
				System.out.println("[1] Real");
				System.out.println("[2] Euro");
				System.out.println("[3] Dolar");
			
				opcaoMoeda = teclado.nextInt();
				System.out.println("Escolha o valor:");
				double valor = teclado.nextDouble();
			
				if (opcaoMoeda == 1) {
					cofrinho.adicionar(new Real(valor));
					
				}
				else if (opcaoMoeda == 2) {
					cofrinho.adicionar(new Euro(valor));
					
				}
				else if (opcaoMoeda == 3) {
					cofrinho.adicionar(new Dolar(valor));
					
				}
				else {
					System.out.println("Digite um valor correto");
				}
				
			}
			else if (opcaoMenu == 2) {
				// remover moeda
			    System.out.println("Qual moeda deseja remover?");
			    System.out.println("[1] Real");
			    System.out.println("[2] Euro");
			    System.out.println("[3] Dólar");
			    opcaoMoeda = teclado.nextInt();

			    System.out.println("Digite o valor da moeda:");
			    valorRemover = teclado.nextDouble();

			    cofrinho.remover(valorRemover, opcaoMoeda);
			}
			else if (opcaoMenu == 3) {
				//listar moedas
				cofrinho.listagemMoedas();
			}
			
			else if (opcaoMenu == 4) {
				// total em reais
				totalConvertido = cofrinho.totalConvertido();
				System.out.println("Total em reais:" + totalConvertido);
			}
			else {
				System.out.println("Erro");
			}
	
		}
	}

}
