package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		int idade = 0, total21 = 0, total50 = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		while(idade != -99) {
			
			if(idade < 21) {
				total21 += 1;
				
			} else if (idade > 50) {
				total50+= 1;
			}
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
		}
		System.out.println("Soma das pessoas com menos de 21 anos: " + total21);
		System.out.println("Soma das pessoas com mais de 50 anos: " + total50);
	}
}
