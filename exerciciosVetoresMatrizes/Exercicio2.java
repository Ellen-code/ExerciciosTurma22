package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int num [] = new int [6];
		int somaPar = 0, quantImpar = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor: ");
				num[i] = ler.nextInt();
				
				if(num[i] % 2 == 0) {
					System.out.println(num[i] + "<-- É um número par" );
					somaPar = somaPar + num[i];
				} else {
					System.out.println(num[i] + "<-- É um número ímpar" );
					quantImpar = quantImpar + 1;
				}	
		}	
		System.out.println("\nSomatória dos números pares: " + somaPar);
		System.out.println("\nSomatória dos números pares: " + quantImpar);
	}
}
