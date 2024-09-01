package application;

import java.util.Locale;
import java.util.Scanner;

public class PeopleHeightApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		// criando os vetores 
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		// for loop para digitar as infs de cada pessoa
		for (int i=0; i<n; i++) {
			System.out.print("Dados da "+ (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		// metodo para somar 
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma = soma + alturas[i];
		}
		// pega o result da soma e divide pela quantidade de pessoas
		double mediaAlturas = soma / n;
		System.out.println();
		System.out.printf("Altura media: %.2f%n", mediaAlturas);

		
		// metodo para contar pessoas com -16 anos
		int cont = 0;
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) {
				cont = cont + 1;
			}
		}
		double percent = cont * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		
		// mostrando nomes dos -16
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) { //se a idade for -16
				System.out.println(nomes[i]); // impreme o nome
			}
		}
		
		
		
		sc.close();
	}
}



