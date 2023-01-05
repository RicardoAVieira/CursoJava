package ArraysECollections.Arrays;

import java.util.Arrays;

public class ExerciciosParaForeach {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		 
		double total=0;
		for(double notas : notasAlunoA) {
			total += notas;
			System.out.println(notas);
			System.out.println(total/notasAlunoA.length);
		}

		System.out.println(Arrays.toString(notasAlunoA));
		
		
		
		double totalb=0;
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		for(double notasb: notasAlunoB) {
			totalb +=notasb;
			System.out.println(notasb);
			System.out.println(totalb/notasAlunoB.length);
		}
	}
}
