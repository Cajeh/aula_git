public class Extrato {

    private ArrayList<Conta> contas;
    private Cliente cliente

    public Conta getConta(String agencia, String conta) {
      for (Conta c : contas) {
        if (c.getAgencia() == agencia && c.getConta() == conta) {
          return c;
        }
      }
      return null;
    }

    public void mostraExtrato(String agencia, String conta) {
      Conta conta = getConta(agencia, conta);
      String extrato = conta.saldo() + conta.transferencia();
      return extrato;
    }
}
