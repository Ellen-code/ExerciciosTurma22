package poo;

import java.util.Scanner;

 /*
 Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, em 
 seguida crie um objeto patinete, defina as instancias deste objeto e apresente as 
 informações deste objeto no console.
 */

public class TestePatinete {
	public static void main(String[] args) {
		//instanciando um objeto da classe Patinete
		int idade = 0;
		float valor = 0;
		
		System.out.println("Digite a idade: ");
		Scanner ler = new Scanner(System.in);
		idade = ler.nextInt();
		
		
		Patinete patinete1 = new Patinete(idade, "amarela", "Calloi", "Elétrica", valor);
		patinete1.imprimirInfo();
		patinete1.imprimirIdade(idade);
		patinete1.calcularValor(valor);
		System.out.println("\n***Dados computados.***");	
	}
}
