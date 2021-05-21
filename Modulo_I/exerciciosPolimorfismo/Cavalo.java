package Animal;

public class Cavalo extends Animal {
	
	//cria��o do m�todo construtor
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
