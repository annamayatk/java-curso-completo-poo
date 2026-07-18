package application;

import java.util.Locale;
import java.util.Scanner;

import utils.ShippingCalculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Weight in kg: ");
		double weight = sc.nextDouble();
		
		System.out.println("Distance in km");
		double dist = sc.nextDouble();
		
		System.out.println("Shipping cost: ");
		System.out.printf("%.2f%n", ShippingCalculator.calculateShipping(weight, dist));
		
		sc.close();
	}

}
