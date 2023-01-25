package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari(int vmax) {
		super(vmax);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;

	}

	@Override
	public void desligarAr() {
		ligarAr = false;

	}
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
		return super.getDelta();
		}
	}

	@Override
	public int acelerar() {
		super.velocidadeAtual += getDelta();
		return super.velocidadeAtual();
	}

	public int frear() {
		if (super.velocidadeAtual() <= 0) {
			velocidadeAtual = 0;
			return super.velocidadeAtual();

		} else {
			super.velocidadeAtual -= 15;
			return super.velocidadeAtual();
		}
	}

}
