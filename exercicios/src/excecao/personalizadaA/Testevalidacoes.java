package excecao.personalizadaA;

import excecao.Aluno;

public class Testevalidacoes {

	public static void main(String[] args) {

		try {
			Aluno aluno;
			aluno = new Aluno("Ricardo", 7);
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim :)");
	}

}
