package exerciciosJava;

import java.util.Scanner;

public class IdadeCategoria {
	public static void main(String[] args) {
		int idade = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma idade: ");
		idade = ler.nextInt();
	
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria infantil");
		} else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria juvenil");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Categoria adulta");
		} else {
			System.out.println("Categoria inválida");		
		}
	}

}
