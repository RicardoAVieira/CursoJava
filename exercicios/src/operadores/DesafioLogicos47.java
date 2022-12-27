package operadores;

public class DesafioLogicos47 {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)

		boolean trabalho1 = true;
		boolean trabalho2 = true;

		System.out.println(trabalho1 && trabalho2
				? "Os dois trabalhos deram certo, vamos comprar uma tv de 50 e vamos tomar sorvete."
				: trabalho1 || trabalho2 ? "Consegui um trabalho, vamos comprar uma TV de 32 e tomar um sorvete."
						: "Não consegui trabalho, é uma pena não vai ter sorvete, mas, ficaremos mais saudáveis.");

	}
}
