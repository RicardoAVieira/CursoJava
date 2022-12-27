package operadores;

public class DesafioAritimeticos43 {
	public static void main(String[] args) {

		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); // utilização de cast.
		double c = Math.pow(a, 3);

		System.out.println(b);
		System.out.println(c);

		double a1 = Math.pow((Math.pow(6 * (3 + 2), 2) / 3 * 2) - Math.pow(((1-5)*(2-7)/2), 2), 3)/Math.pow(10, 3);
		
		
		System.out.println(a1);
		

	}
}
