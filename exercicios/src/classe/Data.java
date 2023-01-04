package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data (){
		/*
		 * dia = 18; mes = 9; ano = 1992;
		 */
		this(18,9,1992); //Apenas em construtores.
	}
	Data(int dia, int mes, int ano){
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}
	
	String obterDataFormatada ( ){
		String df = dia+"/"+mes+"/"+ano;
		return df;
	}
	String dataFormatada() {
		String formato = "%d/%d/%d";
		return String.format(formato ,dia, mes, ano);
	}
	
	void imprimirDataformata() {
		System.out.printf("\nHoje é dia %d/%d/%d",dia, mes, ano);
	}
}
