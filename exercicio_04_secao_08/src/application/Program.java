package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais: ");
		System.out.print(CurrencyConverter.convert(price, dollars));
		
		sc.close();
	}

}
