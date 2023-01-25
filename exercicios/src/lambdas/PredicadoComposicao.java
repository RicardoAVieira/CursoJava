package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

		System.out.println(isTresDigitos.test(70)+" E "+ isPar.negate().test(102));
		System.out.println(isPar.or(isTresDigitos).test(7)+" E "+ isPar.test(102));
	}
}
