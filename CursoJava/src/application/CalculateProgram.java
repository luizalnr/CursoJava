package application;

import java.util.Scanner;
import entities.Calculate;

public class CalculateProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate calculate = new Calculate();
        
        // Exibe o painel de operações
        System.out.print("Operações Disponíveis:\r\n"
                + "1. Adição\r\n"
                + "2. Subtração\r\n"
                + "3. Multiplicação\r\n"
                + "4. Divisão\r\n\r\n");
        
        // Captura o primeiro número
        System.out.print("Escolha o primeiro número: ");
        double number1 = sc.nextDouble(); 
        
        // Captura o segundo número
        System.out.print("Escolha o segundo número: ");
        double number2 = sc.nextDouble();
        
        // Captura a operação desejada
        System.out.print("Escolha uma das operações disponíveis (1-4): ");
        int operation = sc.nextInt();
        
        // Chama o método de cálculo e exibe o resultado
        double result = calculate.operation(number1, number2, operation);
        System.out.println("Resultado: " + result);
        
        // Fecha o scanner
        sc.close();
    }
}

