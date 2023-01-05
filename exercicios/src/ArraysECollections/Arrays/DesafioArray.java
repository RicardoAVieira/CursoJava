package ArraysECollections.Arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe quantos valores vai digitar");
		String vRecebido = entrada.nextLine();
		int tamanho = Integer.parseInt(vRecebido);
		//profesor utilizou nextint()

		double[] notas = new double[tamanho];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a nota %d de %d notas", i + 1, tamanho);
			notas[i] = Double.parseDouble(entrada.nextLine());
		}

		double media = 0;
		for (double tnotas : notas) {
			media += tnotas;
			System.out.println(tnotas);
		}
		System.out.println(" A media de notas é: " + media / tamanho);

		entrada.close();

	}

}
