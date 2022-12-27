package fundamentos;

import java.util.Scanner;

public class DesafioConversao39 {

	public static void main(String[] args) {

		/*
		 * Criar um Scanner e ler 3 strings usando nextline, ler os 3 ultimos salarios
		 * de um funcionário e fazer a media conseguir entender se o funcionario
		 * utilizou ponto ou virgula.
		 */

		Scanner ler = new Scanner(System.in);

		System.out.println("A seguir informe quais foram seus 3 ultimos salarios, desta forma faremos uma media");

		System.out.print("Informe o Primeiro salario:");
		String salario1 = ler.nextLine().replace(",", ".");

		System.out.print("\nInforme o Segundo salario:");
		String salario2 = ler.nextLine().replace(",", ".");

		System.out.print("\nInforme o Terceiro salario:");
		String salario3 = ler.nextLine().replace(",", ".");

		double salario1d = Double.parseDouble(salario1);
		double salario2d = Double.parseDouble(salario2);
		double salario3d = Double.parseDouble(salario3);

		double media = (salario1d + salario2d + salario3d) / 3;

		System.out.printf("\nOs seus salarios foram : R$%2f, R$%2f, R$%2f", salario1d, salario2d, salario3d);

		System.out.printf("\nA media de salario é : %2f", media);

		ler.close();

	}

}
