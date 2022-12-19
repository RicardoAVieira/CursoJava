package fundamentos;

import java.util.Scanner;

public class Console29 {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia !\n");

		System.out.println("Bom dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);

		System.out.printf("\nSalário: %.1f", 1234.5678);

		System.out.printf("\nNome: %s", "João");

		// Entrada de dados via terminal.
		Scanner entrada = new Scanner(System.in);

		System.out.print("\n\nInforme seu Nome :");
		String nome = entrada.nextLine();

		System.out.print("e seu Sobrenome :");
		String sobrenome = entrada.nextLine();

		System.out.print("e sua idade :");
		int idade = entrada.nextInt();

		System.out.println("\n\nO nome Digitado é " + nome + " " + sobrenome + ". Ele tem : " + idade + "anos");
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		
		//Sempre lembrar de fechar as entradas!!!
		entrada.close();
		
	}
}
