package estrutura_repeticao_revisao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n >= 0) {
			for (int i = 1; i <= n; i++) {
				System.out.printf("%d ", i);
				System.out.printf("%d ", (int) Math.pow(i, 2));
				System.out.printf("%d%n", (int) Math.pow(i, 3));
			}
		}
		sc.close();
	}

}
