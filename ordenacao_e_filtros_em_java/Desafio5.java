package ordenacao_e_filtros_em_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {

		// Declaracao do scanner
		Scanner sc = new Scanner(System.in);

		while (true) {

			// Tamanho inicial do vetor
			int n = sc.nextInt();
			if (n == 0)
				break;

			List<Jogador> listaJogadores = new ArrayList<Jogador>();
			for (int index = 0; index < n; index++) {
				String nome = sc.next();
				int valor = sc.nextInt();
				int prev = (((index - 1) % n + n) % n);
				int next = (index + 1) % n;

				listaJogadores.add(new Jogador(nome, valor, prev, next));
			}

			int i = 0;
			while (n > 1) {
				int valor = listaJogadores.get(i).valor;

				if (valor % 2 != 0) {
					for (int j = 0; j < valor; j++)
						i = listaJogadores.get(i).next;
				} else {
					for (int j = 0; j < valor; j++)
						i = listaJogadores.get(i).prev;
				}

				listaJogadores.get(listaJogadores.get(i).prev).next = listaJogadores.get(i).next;
				listaJogadores.get(listaJogadores.get(i).next).prev = listaJogadores.get(i).prev;

				n--;
			}
			i = listaJogadores.get(i).next;

			System.out.println("Vencedor(a): " + listaJogadores.get(i).nome);
		}

		sc.close();

	}

	public static class Jogador {

		public String nome;
		public int valor;
		public int prev;
		public int next;

		public Jogador(String nome, int valor, int prev, int next) {
			this.nome = nome;
			this.valor = valor;
			this.prev = prev;
			this.next = next;
		}

	}

}