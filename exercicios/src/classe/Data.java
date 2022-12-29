package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data (){
		dia = 18;
		mes = 9;
		ano = 1992;
	}
	Data(int ndia, int nmes, int nano){
		ano = nano;
		mes = nmes;
		dia = ndia;
	}
	
	String obterDataFormatada ( ){
		String df = dia+"/"+mes+"/"+ano;
		return df;
	}
	String dataFormatada() {
		return String.format("%d/%d/%d",dia, mes, ano);
	}
	
	void imprimirDataformata() {
		System.out.printf("\nHoje é dia %d/%d/%d",dia, mes, ano);
	}
}
