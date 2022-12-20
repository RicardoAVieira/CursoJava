package fundamentos;

public class ConversaoNumeroString35 {
	public static void main(String[] args) {
		Integer num1 = 10000;
		//convertendo o numero para String, foi possível por exemplo, conferir o número de caracteres.
		System.out.println(num1.toString().length());
		
		//É possível converter um tipo primitivo, des de que chame o tipopo, passandoa  funcionalidade e o valor como parametro.
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
	}
}
