package ordenacao_e_filtros_em_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Desafio2 {

	public static void main(String[] args) {

		// Declaracao do scanner
		Scanner sc = new Scanner(System.in);

		// Tamanho inicial do vetor
		int tamanho = sc.nextInt();
		sc.nextLine();

		String items;
		for (int i = 0; i < tamanho; i++) {

			items = sc.nextLine();

			String[] arrayItems = items.split(" ");
			HashMap<String, Integer> mapItems = new HashMap<String, Integer>();

			for (String item : arrayItems)
				mapItems.put(item, 0);

			List<String> listaItems = new ArrayList<>(mapItems.keySet());
			listaItems = listaItems.stream().sorted().collect(Collectors.toList());

			String impressao = "";
			for (String item : listaItems)
				impressao += item + " ";
			System.out.println(impressao.trim());

		}

		sc.close();

	}

}