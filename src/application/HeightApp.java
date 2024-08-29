package application;

import java.util.Locale;
import java.util.Scanner;

public class HeightApp {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		
		int n = scanner.nextInt(); //"n" sera as alturas que estarao no vect 
		double[] vect = new double[n]; //vetor para armazenar a quantidade de "n"
		
		for (int i=0; i<n; i++) { //i comeca com 0, enquanto i for menor doq n
			vect[i] = scanner.nextDouble(); //vect recebe oq o user digitar
		} 
		
		
		double sum = 0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		
		System.out.printf("AVERAGE HEIGHT: $.2f%n", avg);
		
		
		scanner.close();
	}
}
