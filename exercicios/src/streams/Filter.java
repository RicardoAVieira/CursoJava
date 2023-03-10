package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {

		Consumer<Object> println = System.out::print;

		Aluno a1 = new Aluno("Ana", 7.8, true);
		Aluno a2 = new Aluno("Bia", 5.8, true);
		Aluno a3 = new Aluno("Daniel", 9.8, true);
		Aluno a4 = new Aluno("Gui", 6.8, true);
		Aluno a5 = new Aluno("Rebeca", 7.1, true);
		Aluno a6 = new Aluno("Pedro", 8.8, true);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> resposta = a -> "Parabéns " + a.nome + ", Você foi Aprovado(a)!\\n";

		alunos.stream().filter(aprovado).map(resposta).forEach(println);
	}
}
