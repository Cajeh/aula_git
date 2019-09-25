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

	public void selecionarOp(int op, Conta conta){
		if(op == 1){
			System.out.println("Sua conta eh: " + conta.getConta());
			System.out.println("\nSua agencia eh: " + conta.getAgencia())
		} else if(op == 2){

				} else if(op == 3){
					Operacoes op = new Operacoes();
					System.out.println("Digite 1-SAQUE, 2-DEPOISTO, 3-TRANSFERENCIA: ");
					Scanner ler = new Scanner(System.in);
					n = ler.nextInt();
					if(n==1 || n==2 || n==3){
						op.setTipo(n);
						op.fazerOperacao();
					} else {
						System.out.println("\nNumero invalido!\n");
					}

				} 


	}

}
