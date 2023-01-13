package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunos = new double[4];
		
		// to.string print the string for the best looked
		System.out.println(Arrays.toString(notasAlunos));
		
		notasAlunos[0] = 7;
		notasAlunos[1] = 8;
		notasAlunos[2] = 6.7;
		notasAlunos[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunos));
		
		double totalAlunoA = 0;
		// use length because the variable might change
		for(int i = 0; i < notasAlunos.length; i++) {
			totalAlunoA +=notasAlunos[i];
		}
		
		System.out.println(totalAlunoA/notasAlunos.length);
		
		double[] notasAlunoB = {7.0,8.0,9.0,8.0};
		
		double totalAlunoB=0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			
			totalAlunoB += notasAlunoB[i];
			
		}
		System.out.println(totalAlunoB/notasAlunos.length);
		
		
	}
}