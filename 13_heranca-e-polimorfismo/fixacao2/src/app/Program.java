package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> taxPayers = new ArrayList<>();

		System.out.print("Enter the number of taxpayers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c) ? ");
			char r = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			Double income = sc.nextDouble();

			if (r == 'i') {
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();
				taxPayers.add(new Individual(name, income, health));
			} else if (r == 'c') {
				System.out.print("Number of employees: ");
				int emp = sc.nextInt();
				taxPayers.add(new Company(name, income, emp));
			}

		}
		Double sum = 0.0;
		
		System.out.println();
		
		System.out.println("TAXES PAID: ");
		for (TaxPayer p : taxPayers) {
			System.out.print(p.getName());
			System.out.printf(": $ %.2f%n", p.taxesPaid());
			sum += p.taxesPaid();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES : $ %.2f", sum);
		sc.close();
	}
}
