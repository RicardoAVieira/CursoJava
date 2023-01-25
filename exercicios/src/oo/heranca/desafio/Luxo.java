package oo.heranca.desafio;

public interface Luxo {
	void ligarAr();

	void desligarAr();

	default int nivelDoAr() { // Com o default cria-se uma implementação padrão de algo, deobrigando as
								// classes que estenderam de implementar
		return 1;
	};
}
