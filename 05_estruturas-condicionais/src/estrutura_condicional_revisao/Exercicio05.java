package estrutura_condicional_revisao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		double total = 0.0;
		
		if (cod == 1) {
			total = 4.5 * quant;
		} else if (cod == 2) {
			total = 4.5 * quant;
		} else if (cod == 3) {
			total = 5.0 * quant;
		} else if (cod == 4) {
			total = 2.0 * quant;
		} else if (cod == 5) {
			total = 1.5 * quant;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		sc.close();
	}

}
