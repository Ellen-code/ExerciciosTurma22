package exerciciosJava;

import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		int num;
		double res;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
			res = Math.sqrt(2);
		} else {
			res = Math.pow(num, 2);
		}
		System.out.println("\nValor: " + res);
	}

}
