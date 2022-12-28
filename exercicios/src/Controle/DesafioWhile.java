package Controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Receber notas, apresentar a soma das notas o numero de notas digitadas,
		// escutar -1 para encerrar, ao solicitar emcerrar, deve apresentar as
		// informações anteriores mais a media das notas.

		Scanner entrada = new Scanner(System.in);

		String dado = "";
		double total = 0;
		double media = 0;
		double numero = 0;

		System.out.println(
				"Olá, sou um programa de calculos, informe várias notas e para sair digite -1, ao final vou apresentar a soma, a media e o número de notas digitadas.");

		do {
			System.out.print("Informe uma nota:");
			dado = entrada.nextLine();
			
			dado = dado.replace(',','.');
			
 
			total = Double.parseDouble(dado) > 0 ? total + Double.parseDouble(dado) : total;

			numero = Double.parseDouble(dado) > 0 ? numero = numero + 1 : numero;

			System.out.printf("\n Atualmente são %f notas somando %2f.", numero, total);

		} while (!dado.equals("-1"));
		
		media = total/numero;

		System.out.println("\n\nObrigado por participar!");
		System.out.printf("Os dados são respectivamente: Numero de notas - Media - Valor Total. = %f - %2f - %2f ",
				numero, media, total);

		entrada.close();
	}

}
