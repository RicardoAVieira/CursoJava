package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public int velocidadeAtual() {
		return velocidadeAtual;
	}

	public int acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			return velocidadeAtual();
		} else {
			velocidadeAtual += getDelta();
			return velocidadeAtual();
		}
	}

	public int frear() {
		if (velocidadeAtual() <= 0) {
			velocidadeAtual = 0;
			return velocidadeAtual();
		} else {
			velocidadeAtual -= getDelta();
			return velocidadeAtual();
		}
	}
	public int getDelta() {
		return delta;
	}
	public void setDelta(int delta) {
		this.delta = delta;
	}

}
