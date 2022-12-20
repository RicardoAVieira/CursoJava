package fundamentos;

public class ConversaoTipoPrimitivoNumerico34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//conversão impícita por ser para um Int
			double a = 1;
			System.out.println(a);
			
			
			//Exemplo de conversão explicita (CAST).
			float b = (float)1.123456789101112;
			System.out.println(b);
			
			int c = 127;
			byte d = (byte) c;
			System.out.println(d);
			
			double e = 1;
			int f = (int) e;
			System.out.println(f);
			
	}

}
