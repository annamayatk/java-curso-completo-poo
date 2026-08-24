package exercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exercicio3 {

	public static void main(String[] args) {
		
		String date = "15/03/2023";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.parse(date, formatter1);
		
		System.out.println(d01);
		System.out.println(d01.format(formatter1));
	}

}
