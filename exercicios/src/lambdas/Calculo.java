package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);

	default String lega() {
		return "Não da erro pois o metodo a cima segue como 'principal'";
	}

	static String multoLegal() {
		return "muito legal, acessa diretamente da classe com .";
	}
}
