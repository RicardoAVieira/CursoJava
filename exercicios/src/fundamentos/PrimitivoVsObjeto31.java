package fundamentos;

public class PrimitivoVsObjeto31 {
	public static void main(String[] args) {
		String s = "texto";
		s.toUpperCase();
		
		/*
		 * No java tudo é objeto, menos os tipos primitivos, por isso é possível
		 * utilizar a notação ponto com tudo, menos os primitivos.
		 * 
		 */
		
		
		
		//Wrappers são a versão objeto dos tipos primitivos.
		
		int a =123;
		System.out.println(a);
	}
}
