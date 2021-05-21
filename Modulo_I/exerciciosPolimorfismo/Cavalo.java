package Animal;

public class Cavalo extends Animal {
	
	//criação do método construtor
	public Cavalo (String nome, int idade) {
		super(nome, idade);
	}
	
	
	public void correr() {
		System.out.println("Trotando livremente");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Relichando");
	}
}
