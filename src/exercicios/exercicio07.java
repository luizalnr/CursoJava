package exercicios;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
			}
		}

		
		System.out.println();
		int cont = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
				cont = cont + 1;
			}
		}
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES: %d\n", cont);
		
		
		sc.close();
	}
}