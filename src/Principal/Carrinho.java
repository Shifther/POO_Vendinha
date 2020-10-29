package Principal;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Carrinho {
	private ArrayList listaCarrinho;
	private int IDProduto = 0;
	private double peso = 0.0;
	private double totalPagar = 0.0;
	private double valorFinal = 0.0;
	
	public Carrinho() {
		listaCarrinho = new ArrayList();
	}
	
	public Carrinho(int IDProduto, double peso, double totalPagar) {
		this.IDProduto = IDProduto;
		this.peso = peso;
		this.totalPagar = totalPagar;
	}
	public int getIDProduto() {
		return IDProduto;
	}

	public void setIDProduto(int IDProduto, int IDProdutoNovo) {
		Iterator achaProduto = listaCarrinho.iterator();
		Carrinho carrinho;
		while(achaProduto.hasNext()) {
			carrinho = (Carrinho)achaProduto.next();
			if(carrinho.IDProduto == IDProduto) {
				carrinho.IDProduto = IDProdutoNovo;
			}
		}
	}
	
	public double getPeso(int IDProduto) {
		Iterator achaProduto = listaCarrinho.iterator();
		Carrinho carrinho;
		while(achaProduto.hasNext()) {
			carrinho = (Carrinho)achaProduto.next();
			if(carrinho.IDProduto == IDProduto) {
				return carrinho.peso;
			}
		}
		return 0.0;
	}
	
	public void setPeso(int IDProduto, double peso) {
		Iterator achaProduto = listaCarrinho.iterator();
		Carrinho carrinho;
		while(achaProduto.hasNext()) {
			carrinho = (Carrinho)achaProduto.next();
			if(carrinho.IDProduto == IDProduto) {
				carrinho.peso = peso;
			}
		}
	}
	
	public double getTotalPagar(int IDProduto) {
		Iterator achaProduto = listaCarrinho.iterator();
		Carrinho carrinho;
		while(achaProduto.hasNext()) {
			carrinho = (Carrinho)achaProduto.next();
			if(carrinho.IDProduto == IDProduto) {
				return carrinho.totalPagar;
			}
		}
		return 0.0;
	}
	
	public void setTotalPagar(int IDProduto, double TotalPagar) {
		Iterator achaProduto = listaCarrinho.iterator();
		Carrinho carrinho;
		while(achaProduto.hasNext()) {
			carrinho = (Carrinho)achaProduto.next();
			if(carrinho.IDProduto == IDProduto) {
				carrinho.totalPagar = TotalPagar;
			}
		}
	}
	
	public void adicionarProduto(int IDProduto, double peso, Produto produto) {
		double precoTotal = peso * produto.getPrecoProduto(IDProduto);
		this.valorFinal = this.valorFinal + precoTotal;
		Carrinho novoProduto = new Carrinho(IDProduto, peso, precoTotal);
		listaCarrinho.add(novoProduto);
	}
	
	public String getProduto(Produto produto) {
		DecimalFormat DuasCasas = new DecimalFormat("0.00");
		return	produto.acharProduto(IDProduto) +
				"Quantidade: " + this.peso + " " +
				"Preço total: R$ " + DuasCasas.format(this.totalPagar) + "\n";
	}
	
	public String listaDeProdutos(Produto produto) {
		Iterator achaProduto = listaCarrinho.iterator();
		Carrinho carrinho;
		String saida = "";
		while(achaProduto.hasNext()) {
			carrinho = (Carrinho)achaProduto.next();
			saida += carrinho.getProduto(produto);
		}
		saida += "Valor total da compra" + this.valorFinal;
		return saida;
	}
}
