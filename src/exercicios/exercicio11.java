package exercicios;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int soma = 0;
		int countPares = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) { 
				soma += vect[i];				
				countPares++;
			}
		}
		
		
		if (countPares > 0) {
            double media = (double) soma / countPares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
		
		
		
		sc.close();
	}
}