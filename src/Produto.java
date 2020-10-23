import java.text.DecimalFormat;

public class Produto {

	private String nome;
	private double precoTotal;
	private double peso;
	private double precoUnitario;
	
	// Contrutor
	public Produto(String nome, double precoUnitario, double peso) {
		this.nome = nome;
		this.peso = peso;
		this.precoUnitario = precoUnitario;
	}

	// Encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoTotal() {
		return this.peso * this.precoUnitario;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso < 0) {
			this.peso = 1.0;
		}else {
			this.peso = peso;
		}
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		if(precoUnitario < 0) {
			this.precoUnitario = 1.0;
		}{
			this.precoUnitario = precoUnitario;
		}
	}

	
	public String getGastoComProduto() {
		
		DecimalFormat duasCasasDecimais = new DecimalFormat("0.00");
		return "Produto: " + this.nome + "   " +
				"Preco Unitario: R$ " + duasCasasDecimais.format(this.precoUnitario) + " / Kg  " +
				"peso: " + duasCasasDecimais.format(this.peso) + " Kg   " + 
				"Total: R$ " + duasCasasDecimais.format(getPrecoTotal()) + " \n\n";
	}
	
}
