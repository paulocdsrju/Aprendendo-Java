package teste;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem-Vindo á Calculadora");
		System.out.println("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Escolha a operação (+, -, *, /): ");
		char operacao = scanner.next().charAt(0);
		
		double resultado;
		
		switch (operacao) {
		case '+':
			resultado = num1 + num2;
			System.out.println("Resultado: " + resultado);
			break;
		case '-' :
			resultado = num1 - num2;
			System.out.println("Resultado: " + resultado);
			break;
		case '*':
			resultado = num1 * num2;
			System.out.println("Resultado: " + resultado);
			break;
		case '/':
			if (num2 != 0) {
				resultado = num1 / num2;
				System.out.println("Resultado: " + resultado);
			} else {
				System.out.println("Erro: Divisao por zero!");
			}
			break;
			
			default:
				System.out.println("Operação Invalida!");
				break;
				
		}
		scanner.close();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	