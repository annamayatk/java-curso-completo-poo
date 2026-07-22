package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextDouble();
		}

		double sum = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			sum += vetor[i];
		}
		
		double avg = sum / vetor.length;
		System.out.printf("MEDIA DO VETOR = %.3f%n", avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < avg)
				System.out.printf("%.1f%n", vetor[i]);;
		}
		sc.close();
	}

}
