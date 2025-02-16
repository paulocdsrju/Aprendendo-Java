package teste;

import java.util.Scanner;

import util.java.scanner;

public class Temperatura {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite a temperatura em Fahrenheit: ");
	double Fah = scanner.nextDouble();
	
	double conversao = (Fah - 32) * 5 / 9;
	
	System.out.println("A temperatura em Celsius é: " + conversao);
	
	scanner.close();
		
	}

}
