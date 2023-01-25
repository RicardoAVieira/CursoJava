package oo.heranca.desafioEncapsulamento;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monstro monstro1 = new Monstro();
		monstro1.x = 10;
		monstro1.y = 10;

		Heroi heroi1 = new Heroi(10,11);
		

		System.out.println("Mostro tem = " + monstro1.vida);
		System.out.println("Heroi tem = " + heroi1.vida);
		monstro1.atacar(heroi1);
		heroi1.atacar(monstro1);
		monstro1.atacar(heroi1);
		heroi1.atacar(monstro1);
		
		
		monstro1.atacar(heroi1);
		heroi1.atacar(monstro1);

		monstro1.andar(Direcao.NORTE);
		

		monstro1.atacar(heroi1);
		heroi1.atacar(monstro1);
		System.out.println("Mostro tem = " + monstro1.vida);
		System.out.println("Heroi tem = " + heroi1.vida);
	}

}
