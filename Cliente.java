import java.util.ArrayList;

public class Cliente {
	
	private String cpf;
	private String nome;
	private ArrayList<Conta> contasDoCliente;
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Conta> getContasDoCliente() {
		return contasDoCliente;
	}

	public void setContasDoCliente(ArrayList<Conta> contasDoCliente) {
		this.contasDoCliente = contasDoCliente;
	}
	
	
}
