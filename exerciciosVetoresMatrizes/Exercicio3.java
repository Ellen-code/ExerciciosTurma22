package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int [] [] matriz = new int [3] [3];
		int cont = 0, linha, coluna;
		
		Scanner ler = new Scanner (System.in);
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.println("Entre com os números: ");
				matriz[linha][coluna] = ler.nextInt();
				
				if(matriz[linha][coluna] > 10) {
					cont++;
				}
			}
			System.out.println(cont);
		}	
	}
}
