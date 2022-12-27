package operadores;

public class Atribuicao50 {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;

		c += b;// c = c + b;
		
		c-= a;// c = c - b;
		
		c*= b;// c = c * b;
		
		c/= b;// c = c / b;
		
		c%= b;// c = c % b; - Par ou impar. 0 ou 1;
		
		
		c++; //c = c+1;

	}
}
