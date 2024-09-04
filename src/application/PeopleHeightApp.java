package application;

import java.util.Locale;
import java.util.Scanner;

public class PeopleHeightApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n]; // criando um vetor para armazenar os nomes
		int[] idades = new int[n]; // criando um vetor para armazenar as idades
		double[] alturas = new double[n]; // criando um vetor para armazenar as alturas
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		// metodo para somar todas as idades e achar a media
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma = soma + alturas[i];
		}
		double mediaAlturas = soma / n;
		
		System.out.println();
		System.out.printf("Altura media: %.2f%n", mediaAlturas);
		
		
		// metodo para ter a porcentagem pela idade
		int cont = 0; // variavel q conta as pessoas
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) { // se tiver alguem -16
				cont = cont + 1; // contador conta ela
			}
		}
		double percent = cont * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		
		
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) { // se tiver alguem -16
				System.out.println(nomes[i]);
			}
		}
		
		
		
		sc.close();
	}
}



