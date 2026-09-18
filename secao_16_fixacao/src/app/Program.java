package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		Double value = sc.nextDouble();
		
		Contract contract = new Contract(number, date, value);
		
		System.out.print("Entre com o número de parcelas: ");
		int months = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(contract, months);
		
		System.out.println("PARCELAS: ");
		for (Installment inst : contract.getInstallments()) {
			System.out.println(inst);
		}
		
		sc.close();
	}

}
