package teste;
import java.util.Scanner;

public class TabuadaFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Solicita ao usuario um numero
		System.out.print("Digite um numero para ver a tabuada: ");
		int numero = scanner.nextInt();
		
		System.out.println("Tabuada do " + numero + ":");
		
		//Loop for para calcular e exibir a tabuada
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			
			System.out.println(numero + " x " + i + "=" + resultado);
		}
		
		scanner.close();
	}

}
