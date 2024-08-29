package application;

import java.util.Locale;
import java.util.Scanner;

public class NegativeNumbersApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt(); // quantidade de numeros que vai inserir
		int[] vect = new int[n];
		
		
		if (n > 10) { // se for maior que 10...
			System.out.println("Número inválido. Insira um número menor ou igual a 10.");
		}
		else { // se for menor que 10, ta certo
			for (int i = 0; i < vect.length; i++) {
				System.out.print("Digite um numero: ");
				vect[i] = sc.nextInt(); // vect recebe oq o user digitar
			}
		}
		
		
		System.out.println("NUMEROS NEGATIVOS:");

		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d\n", vect[i]);
			}
		}
		
		
		sc.close();
	}
}