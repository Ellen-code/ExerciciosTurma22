package Animal;

public class TesteAnimal {
	public static void main(String[] args) {
		
		//instanciando um objeto da classe Animal
		
		
		Cachorro cachorro = new Cachorro("Mel", 14);
		System.out.println("\n" + cachorro.getNome());
		cachorro.emitirSom();
		cachorro.correr();
		
		Cavalo cavalo = new Cavalo("Spirit", 20);
		System.out.println("\n" + cavalo.getNome());
		cavalo.emitirSom();
		cavalo.correr();
		
		Preguica preguica = new Preguica("Sid", 15);
		System.out.println("\n" + preguica.getNome());
		preguica.emitirSom();
		preguica.subirArvore();
		
	}
}
