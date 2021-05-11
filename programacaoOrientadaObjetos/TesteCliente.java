package poo;

 /*
 Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em 
 seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
 informações deste objeto no console.
 */

public class TesteCliente {
	public static void main(String[] args) {
		//instanciando um objeto da classe Cliente
		
		Cliente cliente1 = new Cliente(1, "Ana", "Double", "Cartão de Crédito", 5);
		
		cliente1.imprimirInfo();
		System.out.println("\n***Dados confirmados, liberar check in.***");
		
		Cliente cliente2 = new Cliente(5, "Igor", "Twin", "Pacote", 7);
		
		cliente2.imprimirInfo();
		System.out.println("\n***Verificando dados...***");
		cliente2.setNomeCliente("Maria");
		cliente2.imprimirInfo();
		System.out.println("\n***Alteração nome do(a) PAX.***");
		System.out.println("\n***Dados confirmados, liberar check in.***");
	}
}
