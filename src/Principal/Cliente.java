package Principal;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {
	
	private ArrayList listaCliente;
	private int IDCliente;
	private String nomeCliente;
	private String cpfCliente;
	
	public Cliente() {
		listaCliente = new ArrayList();
	}
	
	public Cliente(int IDCliente, String nomeCliente, String cpfCliente) {
		this.IDCliente = IDCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}
	
	public void adicionarCliente(int IDCliente, String nomeCliente, String cpfCliente) {
		Cliente novoCliente = new Cliente(IDCliente, nomeCliente, cpfCliente);
		listaCliente.add(novoCliente);
	}

	public int getIDCliente() {
		return IDCliente;
	}

	public void setIDCliente(int IDCliente, int IDClienteNovo) {
		Iterator achaCliente = listaCliente.iterator();
		Cliente cliente;
		
		while(achaCliente.hasNext()) {
			cliente = (Cliente)achaCliente.next();
			if(cliente.IDCliente == IDCliente) {
				cliente.IDCliente = IDClienteNovo;
			}
		}
	}

	public String getNomeCliente(int IDCliente) {
		Iterator achaCliente = listaCliente.iterator();
		Cliente cliente;
		
		while(achaCliente.hasNext()) {
			cliente = (Cliente)achaCliente.next();
			if(cliente.IDCliente == IDCliente) {
				return cliente.nomeCliente;
			}
		}
		return null;
	}

	public void setNomeCliente(int IDCliente, String nomeCliente) {
		Iterator achaCliente = listaCliente.iterator();
		Cliente cliente;
		
		while(achaCliente.hasNext()) {
			cliente = (Cliente)achaCliente.next();
			if(cliente.IDCliente == IDCliente) {
				cliente.nomeCliente = nomeCliente;
			}
		}
	}

	public String getCpfCliente(int IDCliente) {
		Iterator achaCliente = listaCliente.iterator();
		Cliente cliente;
		
		while(achaCliente.hasNext()) {
			cliente = (Cliente)achaCliente.next();
			if(cliente.IDCliente == IDCliente) {
				return cliente.cpfCliente;
			}
		}
		return null;
	}

	public void setCpfCliente(int IDCliente, String cpfCliente) {
		Iterator achaCliente = listaCliente.iterator();
		Cliente cliente;
		
		while(achaCliente.hasNext()) {
			cliente = (Cliente)achaCliente.next();
			if(cliente.IDCliente == IDCliente) {
				cliente.cpfCliente = cpfCliente;
			}
		}
	}
	
	public String getCliente() {
		return	"ID Cliente: " + this.IDCliente + " " +
				"Nome Cliente: " + this.nomeCliente + " " +
				"CPF Cliente: " + this.cpfCliente + "\n";
	}
	
	public String listaDeCliente() {
		Iterator achaCliente = listaCliente.iterator();
		Cliente cliente;
		String saida = "";
		while(achaCliente.hasNext()) {
			cliente = (Cliente)achaCliente.next();
			saida += cliente.getCliente();
		}
		return saida;
	}
	
	public String acharCliente(int IDCliente) {
		Iterator achaCliente = listaCliente.iterator();
		Cliente cliente;
		
		while(achaCliente.hasNext()) {
			cliente = (Cliente)achaCliente.next();
			if(cliente.IDCliente == IDCliente) {
				return "ID Cliente: " + cliente.IDCliente + " " +
						"Nome Cliente: " + cliente.nomeCliente + " " +
						"CPF Cliente" + cliente.cpfCliente + "\n";
			}
		}
		return null;
	}
	
}
