package oo.composicao.desafio.meuDesafio;

public class LocacaoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ricardo");
		Aluno aluno2 = new Aluno("Joao");
		
		Locacao loc1 = new Locacao();
		Locacao loc2 = new Locacao();
		
		loc1.addItem("Livro1","Ricardo",300,1);
		loc1.addItem("Livro2","Ricardo",600,1);
		loc1.addItem("Livro3","Ricardo",100,1);
		
		loc2.addItem("Livro2","Ricardo",600,1);
		loc2.addItem("Livro3","Ricardo",100,1);
		loc2.addItem("Livro1","Ricardo",300,1);
		
		aluno1.locacoes.add(loc1);
		aluno2.locacoes.add(loc2);
		
		System.out.println("O aluno "+aluno1.nome+"Locou:");
		System.out.println(aluno1.livrosLocados());
		
		System.out.println("O aluno "+aluno2.nome+"Locou:");
		System.out.println(aluno2.livrosLocados());
		

	}

}
