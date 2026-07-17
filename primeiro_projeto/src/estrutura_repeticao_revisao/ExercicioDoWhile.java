package estrutura_repeticao_revisao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String repetir = "n";
		
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 9 * c / 5 + 32;
			 System.out.println("Equivalente em Fahrenheit: " + f);
			 System.out.println("Deseja repetir? (s/n)");
			 repetir = sc.next();
		} while (repetir.equalsIgnoreCase("s"));
		
		sc.close();
	}

}
