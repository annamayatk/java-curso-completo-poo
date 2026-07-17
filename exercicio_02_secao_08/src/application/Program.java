package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();
		
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		employee.netSalary();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary?");
		double perc = sc.nextDouble();
		employee.increaseSalary(perc);
		
		System.out.println("Updated data: " + employee);
		
		
		sc.close();
	}

}
