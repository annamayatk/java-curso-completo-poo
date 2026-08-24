package exercicio6;

import java.time.LocalDate;
import java.time.Period;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("1998-05-07");
		LocalDate d02 = LocalDate.parse("2026-08-18");
		Period p = Period.between(d01, d02);
		System.out.println(p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + " days ");
	}

}
