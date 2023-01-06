package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoHomogeneo {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<String>(); // posso definir um operador Diamond utilizando apenas as <>

		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");

		for (String candidato : lista) {
			System.out.println(candidato);

		}
		System.out.println("");
		
		Set<String> listaOrdenada = new TreeSet<>(); //Este registra os itens inseridos na ordem.
		
		listaOrdenada.add("Ana");
		listaOrdenada.add("Carlos");
		listaOrdenada.add("Luca");
		listaOrdenada.add("Pedro");
		
		for (String candidatoOrdenado : listaOrdenada) {
			System.out.println(candidatoOrdenado);

		}
		
	}

}
