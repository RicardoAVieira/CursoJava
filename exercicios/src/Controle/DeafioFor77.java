package Controle;

public class DeafioFor77 {
	public static void main(String[] args) {

		String valor = "#";
		String valor2 = "#";
		for(int i = 1; i<=5 ; i++) {
			System.out.println(valor);
			valor += "#";
		}
		System.out.println("");
		for(String v = "#";!v.equals("######"); v+="#") {
			System.out.println(valor2);
			valor2 += "#";
		}
		
		//Versão do desafio.
		//Não pode usar valor numerico para controlar o laço.
	}
}
