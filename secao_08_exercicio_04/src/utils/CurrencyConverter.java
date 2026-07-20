package utils;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double convert(double dollarPrice, double dollarsBought) {
		double amount = dollarPrice * dollarsBought; 
				return amount + amount * IOF;
	}
	
	
}
