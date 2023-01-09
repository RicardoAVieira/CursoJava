package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<Integer, String> usuario = new HashMap<>();
			
			usuario.put(1, "Roberto");
			usuario.put(2, "Ricardo");
			usuario.put(3, "Rafaela");
			usuario.put(4, "Renata");
			
			
			System.out.println(usuario.size());
			System.out.println(usuario.isEmpty());
			System.out.println(usuario.keySet());
			System.out.println(usuario.values());
			System.out.println(usuario.entrySet());
			
			System.out.println(usuario.containsKey(2));
			System.out.println(usuario.containsValue("Ricardo"));
			
			System.out.println(usuario.get(2));
			System.out.println(usuario.remove(1));
			System.out.println(usuario.remove(4, "gui"));
			
			for(int chave: usuario.keySet()) {
				System.out.println(chave);
			}
			
			for(String valor: usuario.values()) {
				System.out.println(valor);
			}
			for(Entry<Integer, String> registro: usuario.entrySet()) {
				System.out.print(registro.getKey()+ " ");
				System.out.println(registro.getValue());
			}
	}

}
