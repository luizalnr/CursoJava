package exercicios;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int resposta = (int) (Math.random() * 10) +1;
		int palpite = 0;
		boolean controlador = true;
		
		while (controlador) {
			System.out.println("Tente adivinhar um número entre 1 e 10.");
			palpite = Integer.parseInt(sc.nextLine());
			
			if (palpite == resposta) {
				System.out.println("Parabéns, você conseguiu! :D");
				controlador = false;
			}
			else {
				System.out.println("Chegou perto, quase lá!");
			}
		}
		
		
		
		sc.close();
	}
}