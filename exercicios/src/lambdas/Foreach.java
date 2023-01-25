package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","lua","Cas","Tur","Bru","Lau");
		System.out.println("Forma Tradicional: ");
		for(String nome:aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n\nLambda #01...");
		
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});
		System.out.println("");
		
		//Resumido
		aprovados.forEach(nome ->System.out.println(nome + "!!!"));
		
		//Resumido
		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println);
		//Tradução = Para cada elemento de aprovados, chame println.
		
		System.out.println("\n\nLambda #02...");
		
		aprovados.forEach((nome) -> meuImprimir(nome));
		System.out.println("");
		
		//Resumido
		System.out.println("\n\nMethod Reference 2...");
		aprovados.forEach(Foreach::meuImprimir);
		
		
	}
	
	static void meuImprimir (String nome) {
		System.out.println("Oi, meu nome é :" + nome);
	}
}
