package Animal;

public class Cachorro extends Animal {
	
	//criação do método construtor
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
