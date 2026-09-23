package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();
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
			Product product = new Product(name, price, quant);
			products.add(product);
		}

		Double totalValue = 0.0;
		for (Product p : products) {
			totalValue += p.calcValueInStock();
		}
		System.out.println(totalValue);

		List<Product> outOfStock = products.stream().filter(x -> x.getQuantity() == 0).collect(Collectors.toList());
		for (Product p : outOfStock) {
			System.out.println(p);
		}

		Product aboveHundred = products.stream().filter(x -> x.getPrice() > 100).findFirst().orElse(null);
		System.out.println(aboveHundred);
		
		products.removeIf(x -> x.getPrice() < 5);
		// criei funcao de remover estoque dentro da classe produto mas nao usei.
		
		Product teclado = products.stream().filter(x -> x.getName().equals("Teclado")).findFirst().orElse(null);
		Integer position = products.indexOf(teclado);
		System.out.println(position);
		sc.close();
	}

}
