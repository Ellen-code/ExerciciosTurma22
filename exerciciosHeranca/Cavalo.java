package Animal;

public class Cavalo extends Animal {
	
	//cria��o do m�todo construtor
	public Cavalo (String nome, int idade, String som) {
		super(nome, idade, som);
	}
			
	public void correr () {
		System.out.println("A��o: Est� correndo");
	}
}
