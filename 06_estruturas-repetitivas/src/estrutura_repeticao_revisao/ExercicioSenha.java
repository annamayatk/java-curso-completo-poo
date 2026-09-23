package estrutura_repeticao_revisao;

import java.util.Scanner;

public class ExercicioSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		if (senha == 2002)
			System.out.println("Acesso Permitido");
		
		
		sc.close();
	}

}
