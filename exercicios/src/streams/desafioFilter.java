package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class desafioFilter {

	public static void main(String[] args) {

		Consumer<Object> println = System.out::println;

		Alimento al1 = new Alimento("Brocolis", 110.05, 5.50);
		Alimento al2 = new Alimento("Cenoura", 90.05, 3.50);
		Alimento al3 = new Alimento("CBoi", 200, 55.50);
		Alimento al4 = new Alimento("Chocolate", 510.05, 10.50);
		Alimento al5 = new Alimento("Arroz", 130, 7.50);
		Alimento al6 = new Alimento("Feijao", 125.05, 6.50);

		List<Alimento> receita = Arrays.asList(al1, al2, al3, al4, al5, al6);

		Predicate<Alimento> calorias = al -> al.calorias <= 250.00;
		Predicate<Alimento> barato =al -> al.preco <=15.00;
		Function<Alimento, String> receitaFinal = a -> "O ingrediente " + a.nome + " pode ser utilizado";
		receita.stream().filter(calorias).filter(barato).map(receitaFinal).forEach(println);

	}

}
