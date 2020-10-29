package Principal;

import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Iterator;

public class Produto {
	
	private ArrayList listaProdutos;
	private int IDProduto;
	private String nomeProduto;
	private double precoProduto;
	
	public Produto() {
		listaProdutos = new ArrayList();
	}
	
	public Produto(int IDProduto, String nomeProduto, double precoProduto) {
		this.IDProduto = IDProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}
	
	public void adicionarProduto(int IDProduto, String nomeProduto, double precoProduto) {
		Produto novoProduto = new Produto(IDProduto, nomeProduto, precoProduto);
		listaProdutos.add(novoProduto);
	}
	
	public int getIDProduto() {
		return IDProduto;
	}

	public void setIDProduto(int IDProduto, int IDProdutoNovo) {
		Iterator achaProduto = listaProdutos.iterator();
		Produto produto;
		
		while(achaProduto.hasNext()) {
			produto = (Produto)achaProduto.next();
			if(produto.IDProduto == IDProduto) {
				produto.IDProduto = IDProdutoNovo;
			}
		}
	}

	public String getNomeProduto(int IDProduto) {
		Iterator achaProduto = listaProdutos.iterator();
		Produto produto;
		
		while(achaProduto.hasNext()) {
			produto = (Produto)achaProduto.next();
			if(produto.IDProduto == IDProduto) {
				return produto.nomeProduto;
			}
		}
		return null;
	}

	public void setNomeProduto(int IDProduto, String nomeProduto) {
		Iterator achaProduto = listaProdutos.iterator();
		Produto produto;
		
		while(achaProduto.hasNext()) {
			produto = (Produto)achaProduto.next();
			if(produto.IDProduto == IDProduto) {
				produto.nomeProduto = nomeProduto;
			}
		}
	}

	public double getPrecoProduto(int IDProduto) {
		Iterator achaProduto = listaProdutos.iterator();
		Produto produto;
		
		while(achaProduto.hasNext()) {
			produto = (Produto)achaProduto.next();
			if(produto.IDProduto == IDProduto) {
				return produto.precoProduto;
			}
		}
		return 0.0;
	}

	public void setPrecoProduto(int IDProduto, double precoProduto) {
		Iterator achaProduto = listaProdutos.iterator();
		Produto produto;
		
		while(achaProduto.hasNext()) {
			produto = (Produto)achaProduto.next();
			if(produto.IDProduto == IDProduto) {
				if(precoProduto < 0.0) {
					produto.precoProduto = 1;
				} else {
					produto.precoProduto = precoProduto;
				}
			}
		}
	}
	
	public String getProduto() {
		DecimalFormat DuasCasas = new DecimalFormat("0.00");
		return	"ID Produto: " + this.IDProduto + " " +
				"Produto: " + this.nomeProduto + " " +
				"Preco Unitario: R$ " + DuasCasas.format(this.precoProduto) + "\n";
	}
	
	public String listaDeProdutos() {
		Iterator achaProduto = listaProdutos.iterator();
		Produto produto;
		String saida = "";
		while(achaProduto.hasNext()) {
			produto = (Produto)achaProduto.next();
			saida += produto.getProduto();
		}
		return saida;
	}
	
	public String acharProduto(int IDProduto) {
		DecimalFormat DuasCasas = new DecimalFormat("0.00");
		Iterator achaProduto = listaProdutos.iterator();
		Produto produto;
		
		while(achaProduto.hasNext()) {
			produto = (Produto)achaProduto.next();
			if(produto.IDProduto == IDProduto) {
				return "ID Produto: " + produto.IDProduto + " " +
						"Produto: " + produto.nomeProduto + " " +
						"Preco Unitario: R$ " + DuasCasas.format(produto.precoProduto) + "\n";
			}
		}
		return null;
	}
	
}
