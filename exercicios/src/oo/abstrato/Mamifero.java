package oo.abstrato;

public abstract class Mamifero extends Animal {
	
	@Override
	public final String mover() { //Final faz com que as classes que exenderem não possam modificar ele.
		// TODO Auto-generated method stub
		return "Saindo do local";
	}
	
	public abstract String mamar();
}
