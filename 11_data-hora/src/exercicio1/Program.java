package exercicio1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String birthDate = sc.nextLine();
		String appointmentDate = sc.nextLine();
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate birth = LocalDate.parse(birthDate, fmt1);
		LocalDateTime appointment = LocalDateTime.parse(appointmentDate, fmt2);
		
		Instant cadastro = Instant.now();
		
		System.out.println("Nome: " + name);
		System.out.println("Data de nascimento: " + birth);
		System.out.println("Data da consulta: " + appointment);
		System.out.println("Momento do cadastro: " + cadastro);

		sc.close();
	}

}
