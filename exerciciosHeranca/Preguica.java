package Animal;

public class Preguica extends Animal {
	
	//cria��o do m�todo construtor
	public Preguica (String nome, int idade, String som) {
		super(nome, idade, som);
	}
			
	public void subirArvore () {
		System.out.println("A��o: Est� subindo na �rvore");
	}
}
