public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupanca ***");
        super.imprimirInfosComuns();
    }
    public void imprimirHistorico(){
        System.out.println("*** Historico Conta Poupanca ***");
        super.exibirHistoricoTransacoes();
    }
}
