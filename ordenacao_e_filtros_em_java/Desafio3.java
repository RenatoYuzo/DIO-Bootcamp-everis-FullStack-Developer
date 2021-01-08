package ordenacao_e_filtros_em_java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

		// Declaracao do scanner
		Scanner sc = new Scanner(System.in);

		// Tamanho inicial do vetor
		int tamanhoVetor = sc.nextInt();
		sc.nextLine();

		String nome;
		String cor_tamanho;
		String cor;
		String tamanho;
		List<Camisa> listaCamisas = new ArrayList<Camisa>();
		for (int i = 0; i < tamanhoVetor; i++) {

			nome = sc.nextLine();
			if ("0".equals(nome))
				break;

			cor_tamanho = sc.nextLine();

			String[] aux = cor_tamanho.split(" ");
			cor = aux[0];
			tamanho = aux[1];

			listaCamisas.add(new Camisa(nome, cor, tamanho));

		}

		listaCamisas.sort(Comparator.comparing(Camisa::getNome));
		listaCamisas.sort(Comparator.comparing(Camisa::getTamanho).reversed());
		listaCamisas.sort(Comparator.comparing(Camisa::getCor));

		for (Camisa camisa : listaCamisas) {
			System.out.println(camisa.getCor() + " " + camisa.getTamanho() + " " + camisa.getNome());
		}

		sc.close();

	}

	public static class Camisa {

		private String nome;
		private String cor;
		private String tamanho;

		public Camisa(String nome, String cor, String tamanho) {
			this.nome = nome;
			this.cor = cor;
			this.tamanho = tamanho;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getTamanho() {
			return tamanho;
		}

		public void setTamanho(String tamanho) {
			this.tamanho = tamanho;
		}

	}

}