package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> listaCompra = new ArrayList<>();
	

	void adicionarItem(Produto produto, int quantidade) {
		this.listaCompra.add(new Item(produto, quantidade));

	}

	void adicionarItem(String nome, double valor, int qtde) {
		this.listaCompra.add(new Item(new Produto(nome, valor), qtde));
	}

	double valorTotal() {
		double total = 0;

		for (Item item : listaCompra) {
			total += item.valorItem();
		}

		return total;
	}

}
