package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Student> setA = new HashSet<>();
		Set<Student> setB = new HashSet<>();
		Set<Student> setC = new HashSet<>();

		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int id = sc.nextInt();
			setA.add(new Student(id));
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int id = sc.nextInt();
			setB.add(new Student(id));
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int id = sc.nextInt();
			setC.add(new Student(id));
		}
		
		Set<Student> setD = new HashSet<>(setA);
		setD.addAll(setB);
		setD.addAll(setC);
		
		System.out.println("Total students: " + setD.size());
		sc.close();
	}

}
