package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCirc a1 =  new AreaCirc(10);
		a1.raio = 10;	
		System.out.println(a1.area());
		
		
		//Instanciando o segundo construtor com metodo statico.
		System.out.println(AreaCirc.area(100));
		
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);

	}

}
