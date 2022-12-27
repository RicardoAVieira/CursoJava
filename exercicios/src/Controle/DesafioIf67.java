package Controle;

import javax.swing.JOptionPane;

public class DesafioIf67 {
	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite um dia da semana:");

		if (entrada.toLowerCase().contains("domingo")) {
			System.out.println("1");
		} else if (entrada.toLowerCase().contains("segunda")) {
			System.out.println("2");
		} else if (entrada.toLowerCase().contains("terça")||entrada.toLowerCase().contains("terca")) {
			System.out.println("3");
		} else if (entrada.toLowerCase().contains("quarta")) {
			System.out.println("4");
		} else if (entrada.toLowerCase().contains("quinta")) {
			System.out.println("5");
		} else if (entrada.toLowerCase().contains("sexta")) {
			System.out.println("6");
		} else if (entrada.toLowerCase().contains("sábado")||entrada.toLowerCase().contains("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Informe uma data válida!");
		}
	}

}
