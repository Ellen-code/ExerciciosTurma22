package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int num [] = new int [6];
		int somaPar = 0, quantImpar = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite o " + (i + 1) + "� valor: ");
				num[i] = ler.nextInt();
				
				if(num[i] % 2 == 0) {
					System.out.println(num[i] + "<-- � um n�mero par" );
					somaPar = somaPar + num[i];
				} else {
					System.out.println(num[i] + "<-- � um n�mero �mpar" );
					quantImpar = quantImpar + 1;
				}	
		}	
		System.out.println("\nSomat�ria dos n�meros pares: " + somaPar);
		System.out.println("\nSomat�ria dos n�meros pares: " + quantImpar);
	}
}
