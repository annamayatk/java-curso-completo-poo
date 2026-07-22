package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Digite um numero: ");
			numbers[i] = sc.nextInt();
		}

		int quantity = 0;
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0)
				System.out.printf("%d ", numbers[i]);
				quantity++;
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + quantity);

		sc.close();

	}

}
