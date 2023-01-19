package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	
	Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	int velocidadeAtual() {
		return velocidadeAtual;
	}

	int acelerar() {
		if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			return velocidadeAtual();
		} else {
			velocidadeAtual += 5;
			return velocidadeAtual();
		}
	}

	int frear() {
		if (velocidadeAtual() <= 0) {
			velocidadeAtual = 0;
			return velocidadeAtual();
		} else {
			velocidadeAtual -= 5;
			return velocidadeAtual();
		}
	}

}
