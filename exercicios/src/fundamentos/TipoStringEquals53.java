package fundamentos;

import java.util.Scanner;

public class TipoStringEquals53 {
	public static void main(String[] args) {
		System.out.println("2" == "2");

		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));

		Scanner entrada = new Scanner(System.in);

		String s2 = entrada.next();
		System.out.println("2" == s2);
		System.out.println("2".equals(s2.trim())); //Equals compara as strings. //Trim remove os espaços em branco.

		entrada.close();
	}
}
