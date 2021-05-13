package Animal;

public class Cavalo extends Animal {
	
	//criação do método construtor
	public Cavalo (String nome, int idade, String som) {
		super(nome, idade, som);
	}
			
	public void correr () {
		System.out.println("Ação: Está correndo");
	}
}
