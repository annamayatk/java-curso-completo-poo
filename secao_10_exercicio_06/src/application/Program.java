package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] sum = new int[n];
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < n; i++) {
			vectA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < n; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("Vetor resultante:");
		for (int i = 0; i < n; i++) {
			sum[i] = vectA[i] + vectB[i];
			System.out.println(sum[i]);
		}

		sc.close();
	}

}
