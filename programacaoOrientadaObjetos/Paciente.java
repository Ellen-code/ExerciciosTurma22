package poo;

public class Paciente {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private double IMC =  peso / (altura * altura);
	
	public Paciente(String nome, int idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	
	public void imprimirInfo() {
		System.out.println("\nNome: " + nome + "\nIdade " + idade + "\nAltura " + altura + "\nPeso: " + peso);
	}
	
	
	
	public double calcularIMC(double IMC) {
		if(IMC < 17) {
			System.out.println("Muito abaixo do Peso");
		} else if (IMC >= 17 && IMC < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (IMC >= 18.5 && IMC < 25) {
			System.out.println("Peso ideal");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("Sobrepeso");
		} else if (IMC >= 30 && IMC < 35) {
			System.out.println("Obesidade");
		} else if (IMC >= 35 && IMC > 40) {
			System.out.println("Obesidade severa");
		} else {
			System.out.println("Obesidade mórbida");
		}
		return IMC;
	}
	
}
