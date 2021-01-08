package ordenacao_e_filtros_em_java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Desafio4 {

	public static void main(String[] args) {

		// Declaracao do scanner
		Scanner sc = new Scanner(System.in);

		// Tamanho inicial do vetor
		int tamanhoVetor = sc.nextInt();

		List<Integer> filaOrdemChegada;
		for (int i = 0; i < tamanhoVetor; i++) {
			filaOrdemChegada = new ArrayList<Integer>();

			int tamanhoDaFila = sc.nextInt();
			for (int j = 0; j < tamanhoDaFila; j++)
				filaOrdemChegada.add(sc.nextInt());

			List<Integer> filaOrdemSms = filaOrdemChegada.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

			int contador = 0;
			for (int j = 0; j < tamanhoDaFila; j++)
				if (filaOrdemChegada.get(j) == filaOrdemSms.get(j))
					contador++;

			System.out.println(contador);
		}

		sc.close();

	}

}