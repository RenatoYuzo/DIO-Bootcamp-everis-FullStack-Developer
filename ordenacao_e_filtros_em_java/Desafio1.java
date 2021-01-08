package ordenacao_e_filtros_em_java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Desafio1 {

	public static void main(String[] args) {

		// Declaracao do scanner
		Scanner sc = new Scanner(System.in);

		// Tamanho inicial do vetor
		int tamanho = sc.nextInt();

		List<Integer> listaPares = new ArrayList<Integer>();
		List<Integer> listaImpares = new ArrayList<Integer>();

		int numeroAuxiliar;
		for (int i = 0; i < tamanho; i++) {

			numeroAuxiliar = sc.nextInt();

			if (numeroAuxiliar % 2 == 0)
				listaPares.add(numeroAuxiliar);
			else
				listaImpares.add(numeroAuxiliar);

		}

		listaPares = listaPares.stream().sorted().collect(Collectors.toList());
		listaImpares = listaImpares.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		listaPares.forEach(System.out::println);
		listaImpares.forEach(System.out::println);
		
		sc.close();

	}

}