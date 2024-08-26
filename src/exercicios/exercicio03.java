package exercicios;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//valor do dolar
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		//quantos dolar comprar
		System.out.print("How many dollars will be bought? ");
		double dollarAmount = sc.nextDouble();
		
		//converter dolar para real
		//add 6% de taxa IOF
		double amountToBePaid = CurrencyConverter.convert(dollarPrice, dollarAmount);
		
		//valor final
		System.out.printf("Amount to be paid in reais = %.2f%n", amountToBePaid);
				
				
				
		sc.close();
	}
}
