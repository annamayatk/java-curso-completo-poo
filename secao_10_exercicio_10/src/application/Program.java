package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0, womenCount = 0;
		double height = 0.0, maxHeight, minHeight, womensHeightSum = 0.0, avgWomenHeight;
		char gender;

		System.out.println("Quantas pessoas voce ira digitar? ");
		n = sc.nextInt();
		Person[] person = new Person[n];

		for (int i = 0; i < person.length; i++) {
			System.out.println("Altura da pessoa:");
			height = sc.nextDouble();
			System.out.println("Genero da pessoa:");
			gender = sc.next().charAt(0);
			person[i] = new Person(height, gender);
		}

		minHeight = person[0].getHeight();
		maxHeight = person[0].getHeight();
		for (int i = 0; i < person.length; i++) {

			if (person[i].getHeight() < minHeight) {
				minHeight = person[i].getHeight();
			}

			if (person[i].getHeight() > maxHeight) {
				maxHeight = person[i].getHeight();
			}
		}
		System.out.printf("Menor altura: %.2f%n", minHeight);
		System.out.printf("Maior altura: %.2f%n", maxHeight);
		
		for (int i = 0; i < person.length; i++) {
			if (person[i].getGender() == 'F') {
				womensHeightSum += person[i].getHeight();
				womenCount++;
			}
		}

		avgWomenHeight = womensHeightSum / womenCount;
		System.out.printf("Media das alturas das mulheres = %.2f%n", avgWomenHeight);
		int menCount = person.length - womenCount;
		System.out.println("Numero de homens: "+ menCount);
		sc.close();
	}

}
