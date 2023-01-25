package oo.heranca.desafioEncapsulamento;

import oo.heranca.desafio.Corolla;
import oo.heranca.desafio.Ferrari;

public class Passeio {

	public static void main(String[] args) {

		Ferrari f1 = new Ferrari(200);
		Corolla gli = new Corolla(150);

		System.out.println(f1.velocidadeAtual());
		System.out.println(gli.velocidadeAtual());

		f1.acelerar();
		f1.acelerar();
		System.out.println(f1);
		f1.ligarTurbo();
		f1.acelerar();
		System.out.println(f1);
		f1.desligarTurbo();
		f1.acelerar();
		System.out.println(f1);
		
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
