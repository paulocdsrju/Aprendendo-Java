package teste;

import java.util.Scanner;

public class CalculadoraAvancada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Entrada de dados
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número (ou 0 para operações unárias como raiz quadrada): ");
            double num2 = scanner.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /, ^ para potência, r para raiz quadrada): ");
            char operacao = scanner.next().charAt(0);

            double resultado = 0;

            // Verificar a operação
            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        continue; // Volta ao início do loop
                    }
                    break;
                case '^':
                    resultado = Math.pow(num1, num2); // Potência
                    break;
                case 'r':
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1); // Raiz quadrada
                    } else {
                        System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo!");
                        continue; // Volta ao início do loop
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    continue; // Volta ao início do loop
            }

            // Exibir o resultado
            System.out.println("Resultado: " + resultado);

            // Perguntar se o usuário deseja continuar
            System.out.print("Deseja fazer outro cálculo? (s/n): ");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'n' || resposta == 'N') {
                continuar = false; // Encerra o loop
            }
        }

        System.out.println("Calculadora encerrada. Até mais!");
        scanner.close();
    }
}