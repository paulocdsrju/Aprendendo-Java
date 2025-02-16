package teste;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[]args) {
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("Digite um numero inteiro positivo: ");
			int numero = scanner.nextInt();
		
			boolean ehPrimo = true;
		
			if (numero < 2) {
			ehPrimo = false;
			} else {
				int limite = (int) Math.sqrt(numero);
			
				for (int i = 2; i <= limite; i++) {
					if (numero % i == 0) {
						ehPrimo = false;
						break;
					}
				}
			}
			
			if (ehPrimo) {
				System.out.println(numero + "é primo.");
			} else {
				System.out.println(numero + "não é primo.");
			}
			
			scanner.close();
		}
	}