package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int num = 0, soma = 0;
		Scanner ler = new Scanner(System.in);
		
		do {
			soma += num;
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			
		} while (num != 0); {
			System.out.println("Somat�rio dos n�meros: " + soma);
		}
	}
}
