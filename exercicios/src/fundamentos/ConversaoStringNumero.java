package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.println("O valor de soma é " + soma);
		System.out.println("A média é " + soma/2);
		
		//Para precisão absoluta, utilizar Bigdecimal.
				
		
	}

}
