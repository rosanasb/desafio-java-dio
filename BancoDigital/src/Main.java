public class Main {
    public static void main(String[] args) {
        Cliente rosana = new Cliente();
        rosana.setNome("Rosana");
        Conta cc = new ContaCorrente(rosana);
        Conta poupanca = new ContaPoupanca(rosana);

        Banco banco = new Banco();
        banco.setNome("Banco Digital");

        cc.depositar(100);
        cc.transferir(75, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.imprimirHistorico();
        poupanca.imprimirHistorico();
    }
}
