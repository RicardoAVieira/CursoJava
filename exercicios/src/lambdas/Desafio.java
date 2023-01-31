package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {

//		
//		BinaryOperator<Double> precoReal = (preco, desconto) -> preco -(preco *desconto) ;
//		UnaryOperator<Double> aplicImposto = (preco) -> preco < 2500 ? preco : preco + (preco*0.085);
//		UnaryOperator<Double> aplicFrete = (preco) -> preco < 3000 ? preco + 50 : preco + 100;
//		UnaryOperator<Double> arredondar = (valor) -> Math.ceil(valor);
//		
//		System.out.println(arredondar.apply(aplicFrete.apply(aplicImposto.apply(precoReal.apply(p.preco, p.desconto)))));

		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		Function<Double,String> arredondar = 
				preco -> (String.format("%.2f", preco));
		UnaryOperator<String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");

		Produto p = new Produto("Ipad", 3234.95, 0.13);
		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar)
				.apply(p);

		System.out.println("O preço final é " + preco);
	}
}
