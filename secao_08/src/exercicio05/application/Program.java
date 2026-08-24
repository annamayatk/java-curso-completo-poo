package exercicio05.application;

import java.util.Scanner;

import exercicio05.utils.EnergyBillCalculator;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Consumption (kWh): ");
		double consumption = sc.nextDouble();

		double bill = EnergyBillCalculator.calculateEnergyBill(consumption);

		System.out.printf("Bill: %.2f", bill);

		sc.close();

	}
}
