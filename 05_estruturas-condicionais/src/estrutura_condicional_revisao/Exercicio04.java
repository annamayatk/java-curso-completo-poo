package estrutura_condicional_revisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		int duracao = 0;
		
		//como saber que o jogo começou em um dia e terminou em outro?
		//acho que é: a primeira hora será maior que a segunda
		
		if (horaFim > horaInicio) {
			duracao = horaFim - horaInicio;
		} else {
			duracao = 24 - horaInicio + horaFim;
		}
		
		System.out.printf("O JOGO DUROU %d HORAS", duracao);
		
		sc.close();
	}

}
