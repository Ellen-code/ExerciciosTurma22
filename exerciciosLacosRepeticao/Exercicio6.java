package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		float soma = 0;
		int num, cont = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			if (num % 3 == 0 && num != 0) {
				soma += num;
				cont++;
			}
			
		} while (num != 0); {
			System.out.println("Média: " + soma/cont);
		}
	}
}
