import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Você digitou: " + x);
		
		//
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		//
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);
		
		//
		char a;
		a = sc.next().charAt(0);
		System.out.println("Você digitou: " + a);
		
		//
		String b;
		int c;
		double d;
		//pode ler todos na mesma linha, so dando 1 espaco entre eles
		b = sc.next();
		c = sc.nextInt();
		d = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		sc.close();
		
	}
}
