package oo.composicao.desafio.meuDesafio;



public class Item {
	
	Livro livro;
	int quantidade;
	
	Item(Livro liv, int quant){
		this.livro = liv;
		this.quantidade = quant;
	}
	
	String nomeItem() {
		String nome;
		
		nome = livro.titulo;
		
		return nome;
	}
	
	
	
}
