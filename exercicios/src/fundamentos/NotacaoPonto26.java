package fundamentos;

public class NotacaoPonto26 {
	public static void main(String[] args) {

		String s = "Bom dia X";
		s.toUpperCase(); // Desta forma ele apenas converte mas não armazina na variavel.
		String sConvertido;
		String sReplace;
		String sReplaceUp;

		sConvertido = s.toUpperCase();
		sReplace = s.replace("X", "senhora");
		sReplaceUp = sReplace.toUpperCase().concat(" !!!");

		System.out.println(s);
		System.out.println(sConvertido);
		System.out.println(sReplace);
		System.out.println(sReplaceUp);

		// TIPOS PRIMITIVOS NÃO TEM NOTAÇÂO PONTO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	}
}
