package Animal;

public class Cachorro extends Animal {
	
	//cria��o do m�todo construtor
		public Cachorro (String nome, int idade, String som) {
			super(nome, idade, som);
		}
		
		public void correr () {
			System.out.println("A��o: Est� correndo");
		}
	
}
