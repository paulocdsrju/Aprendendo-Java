package teste;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
	public static void main(String[]args) {
		// Cria um objeto scanner para ler a entrada do usuario
		Scanner scanner = new Scanner(System.in);
		
		//Cria um objeto Random para gerar numeros aleatorios
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100) + 1; //Gera um numero aleatorio entre 1 e 100
		
		System.out.println("Bem-Vindo ao Jogo de Adivinhação");
		System.out.println("Tente adivinhar o número entre 1 e 100.");
		
		int palpite;
		int tentativas = 0;
		boolean acertou = false;
		
		// Laço para continuar o jogo até o usuário acertar
		while (!acertou) {
			System.out.print("Digite o seu palpite: ");
			palpite = scanner.nextInt(); // Lê o palpite do usuario
			tentativas++;
			
			if (palpite == numeroAleatorio) {
				acertou = true;
				System.out.println("Parabens! Você acertou o número em " + tentativas + "tentativas.");
			} else if (palpite < numeroAleatorio) {
				System.out.println("O número é maior que " + palpite + ".");
			} else {
				System.out.println("O número é menor que " + palpite + ".");
			}
		}
		
		// Fechar o scanner (boa pratica)
		scanner.close();
	}

}
