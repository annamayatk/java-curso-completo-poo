package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		int[] numbers = new int[n];
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextInt();
			System.out.println();
		}
		
		System.out.println("NUMEROS NEGATIVOS");
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		
		
		sc.close();
	}
}
