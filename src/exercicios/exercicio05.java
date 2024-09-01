package exercicios;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt(); // quantidade de numeros digitados
		int[] vect = new int[n]; // vetor que leva em consideracao a quant de numeros
		
		for (int i=0; i<vect.length; i++) { // enqt i for menor que a quant q foi digitado, 
			System.out.print("Digite um numero: "); // i acrescenta 1
			vect[i] = sc.nextInt(); // armazenando o numero q o user digitar.
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for (int i=0; i<vect.length; i++) { // vetor q percorre todo o comprimento de vect
			if (vect[i] < 0) { // se o numero digitado for menor q 0
				System.out.println(vect[i]); // mostre o numero
			}			
		}
		
		sc.close();
	}
}