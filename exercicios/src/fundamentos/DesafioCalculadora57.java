package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ler numeros 1 e 2
		// Ler Operação

		String valor1 = JOptionPane.showInputDialog("digite o primeiro numero:");
		String valor2 = JOptionPane.showInputDialog("digite o segundo numero:");
		String valor3 = JOptionPane.showInputDialog("digite a operação a realizar:");

		double resultadoSoma = valor3.equals("+") ? Double.parseDouble(valor1) + Double.parseDouble(valor2) : 0;
		double resultadoSub = valor3.equals("-") ? Double.parseDouble(valor1) - Double.parseDouble(valor2) : 0;
		double resultadoMult = valor3.equals("*") ? Double.parseDouble(valor1) * Double.parseDouble(valor2) : 0;
		double resultadoDiv = valor3.equals("/") ? Double.parseDouble(valor1) / Double.parseDouble(valor2) : 0;
		double resultadoModu = valor3.equals("%") ? Double.parseDouble(valor1) % Double.parseDouble(valor2) : 0;

		System.out.print((resultadoSoma > 0 ? "\nO resultado foi:" + resultadoSoma : ""));
		System.out.print((resultadoSub > 0 ? "\nO resultado foi:" + resultadoSub : ""));
		System.out.print((resultadoMult > 0 ? "\nO resultado foi:" + resultadoMult : ""));
		System.out.print((resultadoDiv > 0 ? "\nO resultado foi:" + resultadoDiv : ""));
		System.out.print((resultadoModu > 0 ? "\nO resultado foi:" + resultadoModu : ""));

	}

}
