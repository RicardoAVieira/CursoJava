package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Ricardo");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Arroz", 22.50, 1);
		compra1.adicionarItem("Feijão", 10.40, 2);
		compra1.adicionarItem("Bife", 72.50, 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("pneu", 1022.50, 1);
		compra2.adicionarItem("detergente", 3.40, 2);
		compra2.adicionarItem("refrigerante", 8.50, 1);
		
		Compra compra3 = new Compra();
		compra3.adicionarItem("pneu", 1022.50, 1);
		compra3.adicionarItem("detergente", 3.40, 2);
		compra3.adicionarItem("refrigerante", 8.50, 1);
		
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		//Utilizando o construtor
		cliente.adicionarCompra(compra3);
		
		System.out.println(cliente.valorTotal());
		
		
	}

}
