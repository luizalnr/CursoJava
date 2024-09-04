package exercicios;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		double soma = 0;
		double media = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = scanner.nextInt();
		
		double[] vect = new double[n];
		
		// pegando os numeros
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = scanner.nextDouble();
		}

		// somando os numeros
		for (int i=0; i<vect.length; i++) {
			soma += vect[i];
		}
		
		// pegando a media de numeros
		media = soma / n;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		
		System.out.printf("ELEMENTOS ABAIXO DA MEDIA =");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		
		scanner.close();
	}
}