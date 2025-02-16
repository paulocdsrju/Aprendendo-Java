package teste;

import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int
		primeiroNumero = scanner.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int segundoNumero = scanner.nextInt();
		
		int resultado = primeiroNumero + segundoNumero;
		
			
		System.out.println("Esse é o resultado da soma: " + resultado);
		
		
	}
}
