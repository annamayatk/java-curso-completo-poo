package exercicio9;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2026-08-15");

		if (d01.getDayOfWeek().getValue() == 6 || d01.getDayOfWeek().getValue() == 7)
			System.out.println("é fim de semana");
		else
			System.out.println("não é fim de semana");
	}

}
