package exercicio02.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import exercicio02.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> emp = new ArrayList<>();

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] vect = line.split(",");
				String name = vect[0];
				String email = vect[1];
				Double salary = Double.parseDouble(vect[2]);

				Employee e = new Employee(name, email, salary);
				emp.add(e);

				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			Double value = sc.nextDouble();

			List<String> emails = emp.stream().filter(e -> e.getSalary() > value).map(e -> e.getEmail())
					.sorted((e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase())).collect(Collectors.toList());

			System.out.println("Email of people whose salary is more than " + String.format("%.2f", value) + ":");
			emails.forEach(System.out::println);

			double sum = emp.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0,
					(x, y) -> x + y);

			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);
	
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
