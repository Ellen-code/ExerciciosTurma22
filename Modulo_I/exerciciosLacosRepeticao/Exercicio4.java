package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		int idade, sexo, fatorp, contpc= 0, contmn = 0, contha = 0, contoc = 0, contpn40 = 0, contpc18 = 0, x = 1;
		
		Scanner ler = new Scanner(System.in);
		
		while(x <= 6) {
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("\nSexo:\n1-Feminino\n2-Masculino\n3-Outros");
			sexo = ler.nextInt();
			
			System.out.println("Fator psicológico:\n1-Calma/o\n2-Nervosa/o\n3-Outros");
			fatorp = ler.nextInt();
			
			if(fatorp == 1) {
				contpc++;
			} if (sexo == 1 && fatorp == 2) {
				contmn++;
			} if(sexo == 2 && fatorp == 3) {
				contha++;
			} if(sexo == 3 && fatorp == 1) {
				contoc++;
			} if (fatorp == 2 && idade > 40) {
				contpn40++;
			} if (fatorp == 1 && idade < 18) {
				contpc18++;
			}
			x++;
		}
		System.out.println("\nQuantidade de pessoas calmas: " + contpc);
		System.out.println("\nQuantidade de mulheres nervosas: " + contmn);
		System.out.println("\nQuantidade de homens agressivos: " + contha);
		System.out.println("\nQuantidade de outras pessoas calmas: " + contoc);
		System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos: " + contoc);
		System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos: " + contoc);
	}
}
