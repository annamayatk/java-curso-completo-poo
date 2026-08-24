package exercicio2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String productName = sc.nextLine();
		String manufacturingDate = sc.nextLine();
		String registrationDate = sc.nextLine();
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate manufacturing = LocalDate.parse(manufacturingDate, fmt1);
		LocalDateTime registration = LocalDateTime.parse(registrationDate, fmt2);
		Instant d0 = Instant.now();
		
		System.out.println(manufacturing.format(fmt1));
		System.out.println(registration.format(fmt2));
		System.out.println(d0);
		
		sc.close();
	}

}
