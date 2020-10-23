import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Carrinho carrinho = new Carrinho();
		Caixa caixa;
		int opcao = 0;
		
		JOptionPane.showMessageDialog(null, "Welcome to MERCADO DO SEU ZEH");
		
		do{
			String nome = JOptionPane.showInputDialog("Escreva o nome do produto: ");
			double precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Escreva o preco por unidade: "));
			double peso = Double.parseDouble(JOptionPane.showInputDialog("Escreva o peso total em (Kg) do produto: "));
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais um produto: 1-Sim | 0-Nao: "));
			
			carrinho.colocarProdutoNoCarrinho(nome, precoUnitario, peso);
		}while(opcao != 0);
		
		String nome = JOptionPane.showInputDialog("Escreva o nome do cliente: ");
		String cpf = JOptionPane.showInputDialog("Escreva o CPF do cliente: ");
		
		caixa = new Caixa(nome, cpf, carrinho);
		
		JOptionPane.showMessageDialog(null, caixa.dadosCompra(), "Resultado da compra", 1);
		
		
	}
}
