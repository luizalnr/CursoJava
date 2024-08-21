package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor desejado: ");
        int x = scanner.nextInt();
        
        for (int i = 1; i <= x; i++) {
        	if (i % 2 != 0) {
				System.out.println(i);
			}
        }
        
        scanner.close();
    }
}

