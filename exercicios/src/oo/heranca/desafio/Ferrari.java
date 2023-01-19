package oo.heranca.desafio;

public class Ferrari extends Carro {

	Ferrari(int vmax) {
		super(vmax);
	}

	@Override
	int acelerar() {
		super.velocidadeAtual += 15;
		return super.velocidadeAtual();
	}

	int frear() {
		if (super.velocidadeAtual() <= 0) {
			velocidadeAtual = 0;
			return super.velocidadeAtual();

		} else {
			super.velocidadeAtual -= 15;
			return super.velocidadeAtual();
		}
	}

}
