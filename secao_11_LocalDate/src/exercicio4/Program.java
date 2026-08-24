package exercicio4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy, HH:mm", Locale.of("pt", "BR"));
		
		LocalDateTime d01 = LocalDateTime.parse("2023-03-15 14:45", formatter1);
		
		System.out.println(d01.format(formatter2));
	}

}
