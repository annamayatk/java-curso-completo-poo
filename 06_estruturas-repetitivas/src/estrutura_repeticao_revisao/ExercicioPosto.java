package estrutura_repeticao_revisao;

import java.util.Scanner;

public class ExercicioPosto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;

		while (codigo != 4) {
			switch (codigo) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}
			
			codigo = sc.nextInt();

		}
		 System.out.println("MUITO OBRIGADO");
		 System.out.println("Alcool: " + alcool);
		 System.out.println("Gasolina: " + gasolina);
		 System.out.println("Diesel: " + diesel);
		 
		sc.close();
	}

}
