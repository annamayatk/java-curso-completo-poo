package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("America/Sao_Paulo"));
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		LocalDate birth = LocalDate.parse(birthDate, fmt1);
		Client client1 = new Client(name, email, birth);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		Order order = new Order(Instant.now(), OrderStatus.valueOf(status), client1);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			
			System.out.print("Product price: ");
			Double pPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product p = new Product(pName, pPrice);
			OrderItem item = new OrderItem(quantity, p);
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		LocalDateTime orderMoment = LocalDateTime.ofInstant(order.getMoment(), ZoneId.of("America/Sao_Paulo"));
		System.out.println("Order moment: " + orderMoment.format(fmt2));
		System.out.println("Order status: " + order.getStatus());
		System.out.println(order.getClient());
		System.out.println("Order items: ");
		
		for (OrderItem o : order.getItems()) {
			System.out.println(o);
		}
		
		System.out.printf("Total price: %.2f", order.total());

		sc.close();
	}

}
