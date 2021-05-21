package Animal;

public class Cachorro extends Animal {
	
	//cria��o do m�todo construtor
		public Cachorro (String nome, int idade) {
			super(nome, idade);
		}
		
		
		public void correr() {
			System.out.println("Correndo feliz");
		}
		
		@Override
		public void emitirSom() {
			System.out.println("Latindo");
		}
	
}
