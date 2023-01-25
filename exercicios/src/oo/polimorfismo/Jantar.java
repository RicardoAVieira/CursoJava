package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ing1 = new Arroz(0.25);
		Feijao ing2 = new Feijao(0.180);
		Sorvete ing3 = new Sorvete(0.1);
		
		Comida ing4 = new Arroz(0.3);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ing1);
		convidado.comer(ing2);
		System.out.println(convidado.getPeso());
		convidado.comer(ing3);
		convidado.comer(ing4);
		System.out.println(convidado.getPeso());
	}

}
