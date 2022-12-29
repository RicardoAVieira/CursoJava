package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data hoje = new Data();
		Data amanha = new Data();
		Data ontem = new Data(28,12,2022);
		Data nascimento = new Data();
		
		hoje.dia = 29;
		hoje.mes = 12;
		hoje.ano = 2022;
		
		amanha.dia = 30;
		amanha.mes = 12;
		amanha.ano = 2022;
		
		
		

		System.out.printf("Hoje é dia %s",hoje.obterDataFormatada());
		
		System.out.printf(" e amanha é dia %s",amanha.dataFormatada());
		
		ontem.imprimirDataformata();
		
		System.out.printf("\n\nEu nasci em: %d/%d/%d",nascimento.dia, nascimento.mes, nascimento.ano);
		
		
		
	}
}
