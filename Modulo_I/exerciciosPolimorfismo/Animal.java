package Animal;

public abstract class Animal {
	//declaração dos atributos da classe;
	private String nome;
	private int idade;
	
	//criação do método construtor
	public Animal (String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	//criação método em comum
	public abstract void emitirSom();

	//Getters e Setters

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
	
}
