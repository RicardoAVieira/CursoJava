package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		/*
		 * Offer e Add adicionam na fila a diferença é que com offer ele avisa se a fila
		 * está cheia
		 */
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		/*
		 * Ambos pegam o primeiro da fila, a diferença é que se estiver vazia o element
		 * da um erro afirmando que está vazia
		 * 
		 * fila.size();
		 * fila.clear();
		 * fila.isEmpty();
		 */
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());

		/*
		 * * fila.size(); fila.clear(); fila.isEmpty(); fila.contains();
		 */
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());// quando naão tem amis elementos ele retorna null
		//System.out.println(fila.remove());Quando não tem amis elementos ele apresenta erro
		
		
		
	}

}
