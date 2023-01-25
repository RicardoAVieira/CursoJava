package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		Produto p2 = new Produto("Caneta2", 12.34, 0.09);
		Produto p3 = new Produto("Caneta3", 12.34, 0.09);
		Produto p4 = new Produto("Caneta4", 12.34, 0.09);
		Produto p5 = new Produto("Caneta5", 12.34, 0.09);
		
		imprimir.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
		
	}
}
