package application;

import java.util.Locale;
import java.util.Scanner;

public class SumAndAverageApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n; 
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		
		System.out.printf("VALORES = ");
		for (int i=0; i<n; i++) {
			System.out.printf(" %.2f", vect[i]);
		}
		
		
		sc.close();
	}

}
