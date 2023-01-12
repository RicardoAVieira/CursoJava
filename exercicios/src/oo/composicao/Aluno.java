package oo.composicao;

import java.util.ArrayList;

public class Aluno {

	final String nome;
	final ArrayList<Curso> curso = new ArrayList<>();

	Aluno(String nome) {
		this.nome = nome;
	}

	void adicionarCurso(Curso curso) {
		this.curso.add(curso);
		curso.alunos.add(this);
	}

	public String toString() {
		return nome;
	}

	Curso obterCursoPorNome(String nome) {
		Curso procurado = null;

		for (Curso curso : this.curso) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}

		return null;
	}
}
