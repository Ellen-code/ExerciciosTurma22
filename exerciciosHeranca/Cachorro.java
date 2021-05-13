package Animal;

public class Cachorro extends Animal {
	
	//criação do método construtor
		public Cachorro (String nome, int idade, String som) {
			super(nome, idade, som);
		}
		
		public void correr () {
			System.out.println("Ação: Está correndo");
		}
	
}
