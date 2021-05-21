package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
			
		int valor[] = new int [10], qtdPares = 0, qtdImpares = 0; 
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < valor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor: ");
				valor[i] = ler.nextInt();
				
				if(valor[i] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
		}
		System.out.println("A quantidade de números pares foi de: " + qtdPares);
		System.out.println("A quantidade de números ímpares foi de: " + qtdImpares);
	}
	
}
