package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double convert(double dollarPrice, double dollarAmount) {
		double amountInReais = dollarPrice * dollarAmount;
		return amountInReais * (1 + IOF);
	}
}
