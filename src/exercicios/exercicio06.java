package exercicios;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();  // Determinar o tamanho do vetor
		double[] vect = new double[n];  // Cria um vetor com comprimento n
				
		for (int i = 0; i < vect.length; i++) {
		    System.out.print("Digite um numero: ");
		    vect[i] = sc.nextDouble();  // Lê e armazena os números decimais no vetor
		}
		
		
		
		 System.out.print("VALORES = ");
	        for (int i = 0; i < vect.length; i++) {
	            System.out.print(vect[i] + " ");
	        }
	        System.out.println();
		
		
		// metodo de soma
		double soma = 0;
		for (int i = 0; i < vect.length; i++) { 
			soma = vect[i] + (vect[i]);
		}
		System.out.printf("SOMA = " + soma);
		
		
		System.out.println();
		double media = soma / 2;
		System.out.printf("MEDIA = " + media);
		
		
		sc.close();
	}
}

