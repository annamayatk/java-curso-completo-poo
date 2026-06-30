import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int workedHours = sc.nextInt();
		double hourlyWage = sc.nextDouble();
		double salary = workedHours * hourlyWage;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salary);
		sc.close();
	}

}
