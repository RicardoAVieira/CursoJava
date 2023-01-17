package oo.heranca;

public class Jogador {
	int x;
	int y;

	boolean andar(Direcao movimento) {
		
		switch(movimento) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}
}
