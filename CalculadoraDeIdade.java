package teste;

import java.util.Scanner;

public class CalculadoraDeIdade {
	public static void main(String[]args) {
		
		// Criar um objeto SCANNER para ler as entradas.
		//Classe scanner -> variavel scanner = cria o objeto scanner
		Scanner scanner = new Scanner(System.in);
	
		// Solicitar o ano atual
		System.out.println("Digite o ano atual: ");
		int anoAtual = scanner.nextInt();
		
		// Solicitar o ano de nascimento
		System.out.println("Digite o seu ano de nascimento: ");
		int anoNascimento = scanner.nextInt();
		
		// Calcular a idade
		int idade = anoAtual - anoNascimento;
		
		//Exibir a idade calculada
		System.out.println("Sua idade é: " + idade + "anos.");
		
		//Encerrar o Scanner (boa prática)
		scanner.close();
		}

	}