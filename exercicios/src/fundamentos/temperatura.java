package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		//ºf -32) X 5/9 = ºC
		
		double f = 70;
		final double FAR= 32;
		final double FATOR = 5.0/9.0;
		double c = (f-FAR)* FATOR ;
		
		System.out.println(f+" Graus Farenheit é igual a "+c+" Graus Centigrados.");
	}
}
