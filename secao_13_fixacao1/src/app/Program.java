package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported? (c / u / i): ");
			char response = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			if (response == 'u') {
				System.out.print("Manufacture date: ");
				String manuf = sc.nextLine();
				LocalDate date = LocalDate.parse(manuf, fmt);
				Product p = new UsedProduct(name, price, date);
				products.add(p);
				
			} else if (response == 'i') {
				System.out.print("Customs fee: ");
				Double customs = sc.nextDouble();
				Product p = new ImportedProduct(name, price, customs);
				products.add(p);
				
			} else if (response == 'c') {
				Product p = new Product(name, price);
				products.add(p);
			}
		}
		
		System.out.println("PRICE TAGS: ");
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}

}
