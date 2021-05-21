package Animal;

public class Preguica extends Animal {
	
	//cria��o do m�todo construtor
	public Preguica (String nome, int idade) {
		super(nome, idade);
	}
	
	public void subirArvore() {
		System.out.println("Subindo lentamente na �rvore");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Grunhindo");
	}
}
