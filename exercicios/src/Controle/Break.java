package Controle;

public class Break {

	public static void main(String[] args) {
		
		//útil para por exemplo ao percorer uma lista e encontrar um determinado item, sair da lista.
		
		for(int i = 0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Fim!");

	}

}
