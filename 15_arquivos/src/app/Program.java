package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();

		String in = "C:\\Users\\Anna\\Documents\\temp\\source.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(in))) {

			String line = br.readLine();
			
			while (line != null) {

				String[] atributes = line.split(",");
				String name = atributes[0];
				Double price = Double.parseDouble(atributes[1]);
				Integer quantity = Integer.parseInt(atributes[2]);
				Product p = new Product(name, price, quantity);
				products.add(p);

				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}

		String createDir = "C:\\Users\\Anna\\Documents\\temp";
		new File(createDir + "\\out").mkdir();
		String out = "C:\\Users\\Anna\\Documents\\temp\\out\\summary.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(out))) {
			
			for (Product p : products) {
				bw.write(p.getName() + ",");
				bw.write(String.format("%.2f", p.total()));
				bw.newLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
