package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
//		exercicio5();
//		exercicio6();
//		exercicio7();
		exercicio8();
	}

	public static void exercicio1() {

		List<String> names = new ArrayList<>();
		names.add("Anna");
		names.add("João");
		names.add("Clara");
		names.add("Diogo");
		names.add("Valdeci");

		System.out.println(names.get(0));
		System.out.println(names.get(names.size() - 1));
		System.out.println("--------------------------");
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
	}

	public static void exercicio2() {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(2);
		numbers.add(4);
		numbers.add(8);
		numbers.add(3);
		numbers.add(3);

		Integer sum = 0;
		for (Integer x : numbers) {
			sum += x;
		}

		System.out.println(sum);
	}

	public static void exercicio3() {

		List<String> elements = new ArrayList<>();

		elements.add("banana");
		elements.add("Florianópolis");
		elements.add("joelho");
		elements.add("caldo de ervilha");

		elements.add(0, "URGENTE");
		elements.add(2, "claudin");

		for (String element : elements) {
			System.out.println(element);
		}

	}

	public static void exercicio4() {

		List<String> names = new ArrayList<>(
				List.of("Anna", "Ana", "Carlos", "Julia", "Mateus", "Carlos", "Ana", "Ana", "José"));

		String alvo = "Felipe";
		int index = names.indexOf(alvo);
		int lastIndex = names.lastIndexOf(alvo);

		if (index == -1) {
			System.out.println(alvo + " não aparece na lista.");
		} else if (index == lastIndex) {
			System.out.println(alvo + " aparece uma vez.");
		} else {
			System.out.println(alvo + " aparece mais de uma vez.");
		}
	}

	public static void exercicio5() {

		List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 20, 50));

		System.out.println(numbers);
		// diferença entre os remove abaixo: o primeiro remove so o item do indice 1. o
		// segundo remove a primeira ocorrencia do numero 20.

		// numbers.remove(1);
		System.out.println(numbers.remove(Integer.valueOf(20)));
		System.out.println(numbers);
	}

	public static void exercicio6() {
		List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

		// numbers.removeIf(n -> n % 2 == 0);

		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			Integer n = it.next();
			if (n % 2 == 0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

	public static void exercicio7() {

		List<Double> salaries = new ArrayList<>();
		salaries.add(4500.0);
		salaries.add(7500.0);
		salaries.add(9000.0);
		salaries.add(1200.0);
		salaries.add(2700.0);

		List<Double> higherSalaries = salaries.stream().filter(x -> x > 5000.0).collect(Collectors.toList());

		for (Double value : higherSalaries) {
			System.out.println(value);
		}
	}

	public static void exercicio8() {

		List<Double> salaries = new ArrayList<>();
		salaries.add(4500.0);
		salaries.add(7500.0);
		salaries.add(9000.0);
		salaries.add(1200.0);
		salaries.add(2700.0);

		Double result = salaries.stream().filter(x -> x > 10000).findFirst().orElse(null);
		Double result2 = salaries.stream().filter(x -> x > 10000).findFirst().orElse(0.0);

		System.out.println(result);
		System.out.println(result2);

	}

	public static void exercicio9() {

		List<String> words = new ArrayList<>();

		words.add("Cachorro");
		words.add("Amigo");
		words.add("Elefante");
		words.add("Tiara");
		words.add("Mão");
		words.add("Uva");

		List<String> bigWords = words.stream().filter(x -> "aeiouAEIOU".indexOf(x.charAt(0)) != -1)
				.filter(x -> x.length() > 4).collect(Collectors.toList());
	
		for (String w : bigWords) {
			System.out.println(w);
		}
	}
}
