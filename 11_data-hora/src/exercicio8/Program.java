package exercicio8;

import java.time.LocalDate;
import java.time.Period;

public class Program {

	public static void main(String[] args) {
		
		LocalDate futureDate = LocalDate.parse("2027-07-03");
		
		Period p = Period.between(LocalDate.now(), futureDate);
		
		System.out.println(p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + " days");
	}

}
