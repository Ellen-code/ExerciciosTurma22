package poo;

public class Cliente {
	//declaração dos atributos da classe
	private int numeroReserva;
	private String nomeCliente;
	private String tipoQuarto;
	private String formaPagamento;
	private int qtdDias;
	
	//criação do método construtor
	public Cliente(int numeroReserva, String nomeCliente, String tipoQuarto, String formaPagamento, int qtdDias) {
		this.numeroReserva = numeroReserva;
		this.nomeCliente = nomeCliente;
		this.tipoQuarto = tipoQuarto;
		this.formaPagamento = formaPagamento;
		this.qtdDias = qtdDias;
	}
	
	public void imprimirInfo() {
		System.out.println("\nReserva: " + numeroReserva + "\nNome: " + nomeCliente + "\nCategoria: " + tipoQuarto + "\nPagamento: " + formaPagamento + "\nDias: " + qtdDias);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public int getNumeroReserva() {
		return numeroReserva;
	}

	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}

	public int getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}
}
