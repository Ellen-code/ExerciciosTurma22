package Animal;

public abstract class Animal {
	//declara��o dos atributos da classe;
	private String nome;
	private int idade;
	
	//cria��o do m�todo construtor
	public Animal (String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	//cria��o m�todo em comum
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
