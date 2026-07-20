package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account ac;

		System.out.println("Enter account number: ");
		int accNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String accHolder = sc.nextLine();

		System.out.println("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		if (initialDeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			ac = new Account(accNumber, accHolder, amount);
		} else {
			ac = new Account(accNumber, accHolder);
		}
		System.out.println("Account data:");
		System.out.println(ac);
		
		System.out.println("Enter a deposit value: ");
		double amount = sc.nextDouble();
		ac.deposit(amount);
		
		System.out.println("Updated account data:");
		System.out.println(ac);
		
		System.out.println("Enter a withdraw value: ");
		amount = sc.nextDouble();
		ac.withdraw(amount);
		
		System.out.println("Updated account data:");
		System.out.println(ac);
		
		sc.close();
	}

}
