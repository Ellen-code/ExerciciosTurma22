package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int [] arrayA = {1, 0, 5, -2, -5, 7};
		int soma = 0, x;
		
		Scanner ler = new Scanner(System.in);
		
			soma = arrayA[0] + arrayA[1] + arrayA[5];
			
			arrayA[4] = 100;
			System.out.println("\nA soma dos �ndices 0, 1, 5 do array A � de: " + soma);
		
		for(x = 0; x < arrayA.length; x++) {
			System.out.print("\n" + arrayA[x]);
		}
		
	}
}
