package Principal;

import javax.swing.JOptionPane;

public class Main {
	
	public static int Menu() {
		int selecao = Integer.parseInt(JOptionPane.showInputDialog("*** Menu *** \n" +
				"1 - Adicionar Produto \n" +
				"2 - Listar Produtos \n" +
				"3 - Editar Produtos \n" +
				"4 - Cadastrar Cliente \n" +
				"5 - Listar Cliente \n" +
				"6 - Editar Cliente \n" +
				"7 - Lançar Compra \n"+
				"10 - Sair do Programa"));
		return selecao;
	}
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		Cliente cliente = new Cliente();
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		int qtdProduto = 0;
		int qtdCliente = 0;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao bar do Hoje!");
		
		int opcao = 0;
		int selecao = 0;
		
		do {
			opcao = 0;
			
			selecao = Menu();
			
			switch(selecao) {
			
				case 1:
					
					do{
						qtdProduto++;
						String nomeProduto = JOptionPane.showInputDialog("Escreva o nome do produto: ");
						double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Escreva o preco por unidade: "));
						opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais um produto? \n" +
								"1 - Sim \n" +
								"0 - Não \n"));
						
						produto.adicionarProduto(qtdProduto, nomeProduto, precoProduto);
						
					}while(opcao != 0);
					
					break;
					
				case 2:
					
					JOptionPane.showMessageDialog(null, produto.listaDeProdutos());
					break;
					
				case 3:
					
					do{
						
						opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja alterar? \n" +
								"1 - Nome do Produto \n" +
								"2 - Preço do Produto \n"));
						
						if(opcao == 1) {
							
							int IDProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do produto: "));
							String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
							produto.setNomeProduto(IDProduto, nomeProduto);
							
						} else if(opcao == 2) {
							
							int IDProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do produto: "));
							double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto: "));
							produto.setPrecoProduto(IDProduto, precoProduto);
							
						}
						
						opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar mais algum produto? \n" +
								"1 - Sim \n" +
								"0 - Não \n"));
						
					}while(opcao!=0);
					
					break;
					
				case 4:
					
					do{
						qtdCliente++;
						String nomeCliente = JOptionPane.showInputDialog("Escreva o nome do cliente: ");
						String cpfCliente = JOptionPane.showInputDialog("Escreva o cpf do cliente: ");
						opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais um cliente? \n" +
								"1 - Sim \n" +
								"0 - Não \n"));
						
						cliente.adicionarCliente(qtdCliente, nomeCliente, cpfCliente);
						
					}while(opcao != 0);
					
					break;
					
				case 5:
					
					JOptionPane.showMessageDialog(null, cliente.listaDeCliente());
					break;
					
				case 6:
					
					do{
						
						opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja alterar? \n" +
								"1 - Nome do cliente \n" +
								"2 - Preço do Produto \n"));
						if(opcao == 1) {
							
							int IDCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente: "));
							String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
							cliente.setNomeCliente(IDCliente, nomeCliente);
							
						} else if(opcao == 2) {
							
							int IDCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente: "));
							String cpfCliente = JOptionPane.showInputDialog("Digite o cpf do cliente");
							cliente.setCpfCliente(IDCliente, cpfCliente);
							
						}
						
						opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar mais algum cliente? \n" +
								"1 - Sim \n" +
								"0 - Não \n"));
						
					}while(opcao!=0);
					
					break;
					
				case 7:
					
					int idcliente = Integer.parseInt(JOptionPane.showInputDialog("Digite a ID do cliente"));
					do {
						int idproduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a ID do produto"));
						double qtd = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade do produto"));
						carrinho.adicionarProduto(idproduto, qtd, produto);
						opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais produtos? \n"+
								"1 - Sim \n" +
								"0 - Não \n"));
					}while(opcao!=0);
					
					JOptionPane.showMessageDialog(null, caixa.dadosCompra(idcliente, cliente, produto, carrinho));
					
					
					break;
					
				case 10:
					
					JOptionPane.showMessageDialog(null, "Até Mais!");
					break;
				
				default:
					
					JOptionPane.showMessageDialog(null, "Valor Incorreto");
					break;
			}
			
		}while(selecao != 10);
		
	}

}
