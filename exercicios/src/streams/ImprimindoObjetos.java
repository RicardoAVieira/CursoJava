package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		//Metodo com For
		for(int i = 0; i<aprovados.size(); i++) {
			System.out.println("Com For: "+aprovados.get(i));
		}
		System.out.println("");
		for(String nome: aprovados) {
			System.out.println("Com ForEach: " + nome);
		}
		System.out.println("");
		
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println("Com Iterator: " + it.next());
		}
		System.out.println();
		System.out.println("Com Stream");
		Stream<String> str = aprovados.stream();
		str.forEach(System.out::println); //Com Laço Interno, os outros precisa criar um laço para percorrer.
				
	}
}
