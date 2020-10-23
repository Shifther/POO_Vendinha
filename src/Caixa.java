
public class Caixa {
	
	private Cliente cliente;
	private Carrinho carrinho;
	
	public Caixa(String nomeCliente, String cpfCliente, Carrinho novoCarrinho) {
		
		this.cliente = new Cliente(nomeCliente, cpfCliente);
		this.carrinho = novoCarrinho;
	}
	
	public String dadosCompra() {
		
		String saida = "";
		
		saida += "Cliente: " + cliente.getNome() + "\n\n" +
				"CPF: " + cliente.getCpf() + "\n\n" +
				"************   Lista de compras ********** \n\n" +
				carrinho.listaDeProdutos();
		
		return saida;
	}

}
