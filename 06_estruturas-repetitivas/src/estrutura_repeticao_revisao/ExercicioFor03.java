package estrutura_repeticao_revisao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double x = 0.0;
		double y = 0.0;
		double z = 0.0;
		double media = 0.0;

		for (int i = 0; i < n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			media = (x * 2 + y * 3 + z * 5) / 10;
			System.out.printf("%.1f%n", media);
		}
		sc.close();
	}

}
