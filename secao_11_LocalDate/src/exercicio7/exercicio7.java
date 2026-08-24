package exercicio7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class exercicio7 {
	public static void main(String[] args)
	{
		LocalDate d01 = LocalDate.parse("1998-05-07");
		long t1 = ChronoUnit.DAYS.between(d01, LocalDate.now());

		System.out.println(t1);
	}
}
