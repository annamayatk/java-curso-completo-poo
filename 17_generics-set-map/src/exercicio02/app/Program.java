package exercicio02.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Double> grades = new LinkedHashMap<>();
		Map<String, Integer> counts = new LinkedHashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine(); 
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null ) {
				String[] fields = line.split(",");
				
				String subject = fields[0];
				Double grade = Double.parseDouble(fields[2]);
				
				if (grades.containsKey(subject)) {
					Double gradesSoFar = grades.get(subject);
				    grades.put(subject, (grade + gradesSoFar));
				    counts.put(subject, counts.get(subject) + 1);
				    
				} else {
				    grades.put(subject, grade);
				    counts.put(subject, 1);
				}
				line = br.readLine();
			}
			
			for (String key : grades.keySet()) {
				grades.put(key, grades.get(key) / (double) counts.get(key));
				System.out.println(key + ": " + String.format("%.2f", grades.get(key)));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
	
}
