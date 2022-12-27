package operadores;

public class Ternario52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Evitar utilizar ternarios encadeados.

		double media = 7.6;
		String resultadoRecuperacao = media >= 5 ? "Em recuperação" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";

		System.out.println("O aluno foi " + resultado + " na escola.");

	}

}
