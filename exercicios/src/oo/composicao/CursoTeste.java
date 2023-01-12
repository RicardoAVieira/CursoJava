package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ricardo");
		Aluno aluno2 = new Aluno("Rafael");
		Aluno aluno3 = new Aluno("Renata");

		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);

		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);

		for (Aluno alu1 : curso1.alunos) {
			System.out.println("Estou matriculaod no curso 1 e meu nome é: " + alu1.nome + " ");
		}
		for (Aluno alu2 : curso2.alunos) {
			System.out.println("Estou matriculaod no curso 2 e meu nome é: " + alu2.nome + " ");
		}
		for (Aluno alu3 : curso3.alunos) {
			System.out.println("Estou matriculaod no curso 3 e meu nome é: " + alu3.nome + " ");
		}
		System.out.println("\n\n");

		System.out.println(aluno1.curso.get(0).alunos);

		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
