package Animal;

public class Preguica extends Animal {
	
	//criação do método construtor
	public Preguica (String nome, int idade, String som) {
		super(nome, idade, som);
	}
			
	public void subirArvore () {
		System.out.println("Ação: Está subindo na árvore");
	}
}
