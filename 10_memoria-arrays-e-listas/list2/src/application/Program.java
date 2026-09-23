package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> productList = new ArrayList<>();

		System.out.println("How many products will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1));
			System.out.println("Code: ");
			Integer code = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			System.out.println("Quantity: ");
			Integer quant = sc.nextInt();
			Product product = new Product(code, name, price, quant);
			productList.add(product);
		}
		
		System.out.println("Enter the product code that will have a discount:");
		int codeToBeDiscounted = sc.nextInt();
		
		Product p = productList.stream().filter(x -> x.getCode().equals(codeToBeDiscounted)).findFirst().orElse(null);
		
		if (p != null) {
			System.out.println("Enter the discount percentage:");
			double perc = sc.nextDouble();
			p.applyDiscount(perc);
			System.out.println(p.getName());
		}
		
		System.out.println("List of products: ");
		for (Product prod : productList) {
			System.out.println(prod);
			System.out.println();
		}
		sc.close();
	}

}
