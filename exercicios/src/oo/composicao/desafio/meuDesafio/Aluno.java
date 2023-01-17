package oo.composicao.desafio.meuDesafio;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	String nome;
	List<Locacao> locacoes = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	void addLocacao(Locacao locacao) {
		this.locacoes.add(locacao);
	}
	int paginas() {
		int total=0;
		
		
		return total;
	}
	String livrosLocados() {
		String livros ="";
		for(Locacao loc:  locacoes) {
			livros += "\n "+ loc.livrosLocados();
		}
		return livros;
	}
}
