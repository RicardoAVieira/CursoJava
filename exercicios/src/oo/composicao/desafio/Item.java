package oo.composicao.desafio;

public class Item {
	final Produto produto;
	final int quantidade;
	
	Compra compra;
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
	double valorItem() {
		return produto.valor * quantidade;
	}
	
}
