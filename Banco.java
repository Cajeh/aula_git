import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	
	private ArrayList<Cliente> clientes = new ArrayList<>();
	
	public ArrayList<Cliente> getClientes(){
		return clientes
	}
	
	public Cliente buscarClientePorCpf(String cpf) {
		for (Cliente c : clientes) {
			if (c.getCpf() == cpf) {
				return c;
			}
		}
		return null;
	}
	
	public Cliente getCliente() {
		Scanner sc = new Scanner(System.in);
		String cpf;
		
		System.out.println("Digite o CPF do cliente: ");
		cpf = sc.nextLine();
		
		Cliente cliente = buscarClientePorCpf(cpf);
		
		return cliente;
	}

}
