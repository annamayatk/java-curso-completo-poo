package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, ordinal, age, highestAge;
		String name, oldest = "";

		System.out.println("Quantas pessoas voce ira digitar? ");
		n = sc.nextInt();
		Person[] person = new Person[n];

		for (int i = 0; i < person.length; i++) {
			ordinal = i+1;
			System.out.printf("Dados da %da pessoa:%n", ordinal);
			sc.nextLine();
			System.out.printf("Nome: %n");
			name = sc.nextLine();
			
			System.out.printf("Idade: %n");
			age = sc.nextInt();
			
			person[i] = new Person(name, age);
		}
		
		highestAge = person[0].getAge();
		
		for (int i = 1; i < person.length; i++) {
			if (person[i].getAge() > highestAge) {
				highestAge = person[i].getAge();
				oldest = person[i].getName();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: "+ oldest);
		sc.close();
	}

}
