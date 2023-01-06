package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); //boolean - Boolean
		conjunto.add("teste"); //String
		conjunto.add(1); //int - Integer
		conjunto.add('x'); //char
		
		System.out.println("Tamanho é: "+conjunto.size());
		conjunto.add("Teste");
		conjunto.add("x");
		
		System.out.println("Tamanho é: "+conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		
		System.out.println("Tamanho é: "+conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //União
		conjunto.retainAll(nums); //retem apenas o que tem em comun.
		
		System.out.println(conjunto);
		
		//
		
	}
}
