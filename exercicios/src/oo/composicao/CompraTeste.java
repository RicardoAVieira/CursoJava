package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		 compra1.cliente = "João Pedro";
		 compra1.adicionarItem("Caneta", 20, 7.45);
		 compra1.adicionarItem(new Item("Caderno", 5, 70.20));
		 compra1.adicionarItem(new Item("Borracha", 2, 3.95));
		 
		 System.out.println(compra1.itens.size());
		 System.out.println(compra1.getvalorTotal());
		 
		 
		 //Só para mostrar a bidirecionl
		 double total = compra1.itens.get(0).compra.itens.get(1).compra.getvalorTotal();
		 System.out.println("O valor total é " + total);

	}

}
