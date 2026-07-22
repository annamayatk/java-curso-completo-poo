package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Person[] person = new Person[n];
		double sum = 0.0;
		int minors = 0;

		for (int i = 0; i < person.length; i++) {
			int ordinal = i + 1;
			System.out.printf("Dados da %da pessoa:%n", ordinal);
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Idade: ");
			int age = sc.nextInt();
			System.out.println("Altura: ");
			double height = sc.nextDouble();
			person[i] = new Person(name, age, height);

			sum += person[i].getHeight();

			if (person[i].getAge() < 16) {
				minors++;
			}
		}

		double avg = sum / person.length;
		System.out.printf("Altura média: %.2f%n", avg);

		double perc = (double) minors * 100 / person.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", perc);

		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16)
				System.out.println(person[i].getName());
		}

		sc.close();
	}

}
