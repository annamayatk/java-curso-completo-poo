package exercicio01.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import exercicio01.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				String[] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				
				Product p = new Product(name, price);
				products.add(p);
				
				line = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Double sum = products.stream()
				.map(p -> p.getPrice())
				.reduce(0.0, Double::sum);
		
//		for (Product p : products) {
//			sum += p.getPrice();
//		} 
		
		Double avg = sum / products.size();
		
		System.out.println("Average price: " + String.format("%.2f", avg));
		
		//criar uma lista de nomes de produto
		//somente com os produtos que possuem preço inferior a media
		//exibi-los em ordem decrescente de nome
		
		List<String> names = products.stream()
				.filter(p -> p.getPrice() < avg)
				.map(p -> p.getName())
				.sorted((p1, p2) -> p1.toUpperCase().compareTo(p2.toUpperCase()))
				.collect(Collectors.toList());
		
				names.reversed().forEach(System.out::println);
		
		sc.close();
		
		
	}

}
