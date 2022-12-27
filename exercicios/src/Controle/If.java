package Controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média:");
		double media =  entrada.nextDouble();
		
		
		if(media >=7) {
			System.out.println("Aluno com media maior que 7");
		} else {
			System.out.println("Sinto Muito, você não atingiu a media");
		}
		
		entrada.close();
	}
}
