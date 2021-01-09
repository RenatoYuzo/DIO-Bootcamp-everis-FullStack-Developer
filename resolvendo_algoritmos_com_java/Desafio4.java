package resolvendo_algoritmos_com_java;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = Integer.parseInt(input);

		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int result = 0;

			for (int j = 0; j < l; j++) {

				String lines = sc.next();
				char[] array = lines.toCharArray();
				for (int z = 0; z < array.length; z++) {
					int alPos = (int) array[z] - 65;
					result += alPos + j + z;
				}

			}
			System.out.println(result);
		}

		sc.close();
	}
}