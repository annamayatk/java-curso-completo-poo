package estrutura_condicional_revisao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		int x, y;
		
		a = sc.nextInt();
		b = sc.nextInt();
		//primeiro definir quem e maior
		x = Math.max(a, b);
		y = Math.min(a, b);
		
		//depois dividir e ver se sobra
		if (x % y == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}

}
