package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Prícipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for (String livro: livros) {
			System.out.println(livro);
		}
		
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop()); //também da erro caso não tenha o que remover
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove()); Retorna exception por estar vazio

		livros.size();
		livros.clear();
		livros.contains("");
		
		
	}

}
