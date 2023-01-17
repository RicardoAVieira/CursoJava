package oo.composicao.desafio.meuDesafio;

import java.util.ArrayList;
import java.util.List;

public class Locacao {

	List<Item> itens = new ArrayList<>();

	void addItem(Livro livro, int quant) {
		this.itens.add(new Item(livro, quant));
	}

	void addItem(String tit, String aut, int pag, int quant) {
		this.itens.add(new Item(new Livro(tit, aut, pag), quant));
	}
	
	String livrosLocados() {
		String livros ="";
		for(Item item: itens) {
			livros += "\n "+ item.nomeItem();
		}
		return livros;
	}
}
