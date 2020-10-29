package Principal;

public class Caixa {
	
	public void Caixa() {
		
	}
	public String dadosCompra(int IDCliente, Cliente cliente, Produto produto, Carrinho carrinho) {
		
		String saida = "";
		
		saida += "Cliente: " + cliente.getNomeCliente(IDCliente) + "\n\n" +
				"CPF: " + cliente.getCpfCliente(IDCliente) + "\n\n" +
				"************   Lista de compras ********** \n\n" +
				carrinho.listaDeProdutos(produto);
		
		return saida;
	}

}