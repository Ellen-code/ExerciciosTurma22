package Animal;

public class Preguica extends Animal {
	
	//criação do método construtor
	public Preguica (String nome, int idade) {
		super(nome, idade);
	}
	
	public void subirArvore() {
		System.out.println("Subindo lentamente na árvore");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Grunhindo");
	}
}
