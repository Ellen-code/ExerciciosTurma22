package poo;

public class Patinete {
	//declaração dos atributos da classe
	private int idade;
	private String cor;
	private String marca;
	private String tipo;
	private float valor;
	
	//criação do método construtor
	public Patinete(int idade, String cor, String marca, String tipo, float valor) {
		this.idade = idade;
		this.cor = cor;
		this.marca = marca;
		this.tipo = tipo;
		this.valor = valor;	
	}	
	
	//estrutura condicional
	public int imprimirIdade(int idade) {
		if (idade >= 5 && idade <= 7) {
			System.out.println("Recomendação: Patinete Infantil I");
		} else if (idade >= 8 && idade <= 11) {
			System.out.println("Recomendação: Patinete Infantil II");
		} else if (idade >= 12 && idade <= 15) {
			System.out.println("Recomendação: Patinete Juvenil I");
		} else if (idade >= 16 && idade <= 18) {
			System.out.println("Recomendação: Patinete Juvenil II");
		} else if (idade > 18) {
			System.out.println("Recomendação: Patinete Adulto");
		} else {
			System.out.println("Sem disponibilidade");
		}
		return idade;
	}
	
	public float calcularValor(float valor) {
		if (idade >= 5 && idade <= 7) {
			System.out.println("Valor: R$ 150,00");
		} else if (idade >= 8 && idade <= 11) {
			System.out.println("Valor: R$ 200,00");
		} else if (idade >= 12 && idade <= 15) {
			System.out.println("Valor: R$ 250,00");
		} else if (idade >= 16 && idade <= 18) {
			System.out.println("Valor: R$ 300,00");
		} else if (idade > 18) {
			System.out.println("Valor: R$ 350,00");
		} else {
			System.out.println("Valor: R$ 400,00");
		}
		return valor;
	}

	public void imprimirInfo() {
		System.out.println("\nIdade: " + idade + "\nCor: " + cor + "\nMarca: " + marca + "\nTipo: " + tipo);
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
