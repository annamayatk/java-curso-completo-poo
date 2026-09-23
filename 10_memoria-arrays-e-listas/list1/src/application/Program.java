package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.printf("Id: ");
			Integer id = sc.nextInt();
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			Double salary = sc.nextDouble();

			Employee e = new Employee(id, name, salary);
			list.add(e);
		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int idForSalaryIncrease = sc.nextInt();
		
		// outra opção:
		//Employee emp = list.stream().filter(x -> x.getId() == idForSalaryIncrease).findFirst().orElse(null);
		
		Integer pos = findPosition(list, idForSalaryIncrease);

		if (pos == null) {
			System.out.println("This id does not exist");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");

		for (Employee e : list) {
			System.out.println(e);
		}
		sc.close();
	}

	public static Integer findPosition(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			// pegar na lista o objeto na posição "i", e pegar a id dele e comparar.
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
