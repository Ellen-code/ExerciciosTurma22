package exerciciosJava;

import java.util.Scanner;

public class NumerosInteiros {
	public static void main(String[] args) {
		int valor[] = new int [3], maiorValor = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < valor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor: ");
				valor[i] = ler.nextInt();
				
				if (valor[i] > maiorValor) {
					maiorValor = valor[i];
				}
		}
		System.out.println("O maior valor digitado foi: " + maiorValor);	
	}
}
