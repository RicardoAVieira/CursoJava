package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if(...) sentenca; ou{}
		// while(...) sentenca; ou{}
		// for(...;...;...;) sentenca; ou {}
		// do {} while(...);

		Scanner entrada = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Você deseja sair ?\n");
			texto = entrada.nextLine();

		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado até mais !");
		entrada.close();

	}

}
