package Animal;

public class Animal {
	//declaração dos atributos da classe;
	private String nome;
	private int idade;
	private String som;
	
	
	//criação do método construtor
	public Animal (String nome, int idade, String som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;	
	}
	
	//criação método para impressão
	public void imprimirInfo() {
		System.out.println("\nNome: " + nome + "\nIdade: " + idade);
	}
	
	//criação método em comum
	public void emitirSom() {
		System.out.println("Som: " + som);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
		
}
