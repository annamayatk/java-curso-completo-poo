package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p;
		
		System.out.println("------ NEW PRODUCT ------");
		System.out.println("Insert product code: ");
		int code = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert product name: ");
		String name = sc.nextLine();
		
		System.out.println("Insert product price: ");
		double price = sc.nextDouble();
		
		System.out.println("Is there an initial stock entry? (y/n) ");
		char response = sc.next().charAt(0);
		
		if (response == 'y' ) {
			System.out.println("Enter quantity: ");
			int amount = sc.nextInt();
			p = new Product(code, name, price, amount);
		} else {
			p = new Product(code, name, price);
		}
		
		System.out.println(p);
		
		System.out.println("Enter received quantity: ");
		int quantity = sc.nextInt();
		p.receiveGoods(quantity);
		System.out.println("Updated data: ");
		System.out.println(p);
		
		System.out.println("Enter quantity to issue: ");
		quantity = sc.nextInt();
		p.issueGoods(quantity);
		System.out.println("Updated data: ");
		System.out.println(p);
		
		System.out.println("Update price: ");
		price = sc.nextDouble();
		p.setPrice(price);
		System.out.println(p);
		
		sc.close();
	}

}
