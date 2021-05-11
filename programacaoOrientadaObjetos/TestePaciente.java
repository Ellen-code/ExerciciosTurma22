package poo;

import java.util.Scanner;

/*
Crie uma classe paciente e apresente os atributos e métodos referentes 
esta classe, em seguida crie um objeto paciente, defina as instancias 
deste objeto e apresente as informações deste objeto no console.
*/

public class TestePaciente {
	public static void main(String[] args) {
		double peso = 0.0;
		double altura = 0.0;
		double IMC = 0.0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Peso: "  + peso + "Kg");
		peso = ler.nextDouble();
		
		System.out.println("Altura: "  + altura + "m");
		altura = ler.nextDouble();
		
		Paciente paciente1 = new Paciente("Maria", 20, altura, peso);
		paciente1.imprimirInfo();
		paciente1.calcularIMC(IMC);
	}
}
