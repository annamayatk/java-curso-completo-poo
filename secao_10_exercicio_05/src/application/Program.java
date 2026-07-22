package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double max = vect[0]; 
		int position = 0;
		
		for (int i = 1; i < vect.length; i++) {
			if (vect[i] > max) {
				max = vect[i];
				position = i;
			}
		}
		System.out.printf("MAIOR VALOR = %.1f%n", max);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", position);

		sc.close();
	}

}
