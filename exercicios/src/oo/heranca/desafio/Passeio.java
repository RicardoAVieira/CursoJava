package oo.heranca.desafio;

public class Passeio {

	public static void main(String[] args) {

		Ferrari f1 = new Ferrari(200);
		Corolla gli = new Corolla(150);

		System.out.println(f1.velocidadeAtual());
		System.out.println(gli.velocidadeAtual());

		f1.acelerar();
		gli.acelerar();
		gli.acelerar();

		System.out.println(f1.velocidadeAtual());
		System.out.println(gli.velocidadeAtual());
		f1.frear();
		gli.frear();

		System.out.println(f1.velocidadeAtual());
		System.out.println(gli.velocidadeAtual());
		f1.frear();
		gli.frear();
		System.out.println(f1.velocidadeAtual());
		System.out.println(gli.velocidadeAtual());
	}

}
