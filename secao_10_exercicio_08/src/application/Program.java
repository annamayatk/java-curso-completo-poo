package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		int sum = 0;
		int count = 0;

		System.out.println("Quantos elementos terá o vetor? ");
		n = sc.nextInt();

		int[] vet = new int[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um numero: ");
			vet[i] = sc.nextInt();

		}
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				sum += vet[i];
				count++;
			}
		}
		
		if (count > 0) {
			double avg = (double) sum / count;
			System.out.printf("MEDIA DOS PARES = %.1f", avg);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
