package Animal;

import java.util.Scanner;

public class AnimalPrincipal {
	public static void main(String[] args) {
		
		//instanciando um objeto da classe Cliente
		
		
		Cachorro cachorro = new Cachorro("Mel", 14, "latindo");
		cachorro.imprimirInfo();
		cachorro.emitirSom();
		cachorro.correr();
		
		Cavalo cavalo = new Cavalo("Spirit", 20, "relinchando");
		cavalo.imprimirInfo();
		cavalo.emitirSom();
		cavalo.correr();
		
		Preguica preguica = new Preguica("Sid", 15, "Zzzzzzzz");
		preguica.imprimirInfo();
		preguica.emitirSom();
		preguica.subirArvore();
		
	}
}
