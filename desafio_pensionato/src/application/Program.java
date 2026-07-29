package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] rooms = new Rent[10];
		String name = "", email = "";

		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int ordinal = i + 1;
			System.out.printf("Rent #%d:%n", ordinal);

			sc.nextLine();
			System.out.printf("Name: ");
			name = sc.nextLine();

			System.out.printf("Email: ");
			email = sc.nextLine();

			System.out.printf("Room: ");
			int number = sc.nextInt();
			rooms[number] = new Rent(name, email);
		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.print(i);
				System.out.print(rooms[i]);
				System.out.println();
			}
		}

		sc.close();
	}

}
