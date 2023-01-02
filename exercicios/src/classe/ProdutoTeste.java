package classe;

/*import java.util.Scanner;*/

public class ProdutoTeste {
	public static void main(String[] args) {
		/*
		 * int a = 3; Scanner entrada = new Scanner(System.in);
		 * Apenas para comparação
		 */
		
		Produto p1 = new Produto("Notebook", 4356.89);
		
		//p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		
		 
		var p2 = new Produto();
		
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome); 
		System.out.println(p2.nome );
		
	
		
		
		System.out.println("\n\n");
		
		double p1Desconto = p1.precoComDesconto();
		double p2Desconto = p2.precoComDesconto(0.15);
		double mediaCarrinho = ((p1Desconto + p2Desconto)/2);
		
		System.out.println("A media do carrinho é: "+mediaCarrinho);
		
		
		
	}
}
