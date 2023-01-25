package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;

	public int getIdade() {
		return idade;
	}

	public Pessoa(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		}
	}

	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 130) {
			this.idade = novaIdade;
		} else {

		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
