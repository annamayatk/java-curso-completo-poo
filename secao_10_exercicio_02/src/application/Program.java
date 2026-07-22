package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			System.out.println();
		}

		double sum = 0;
		
		System.out.print("VALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
			sum += vect[i];
		}
		System.out.println();
		System.out.printf("SOMA = %.2f%n", sum);
		
		double avg = sum / vect.length;
		System.out.printf("MEDIA = %.2f", avg);

		sc.close();
	}

}
