import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o numero da Agencia: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite a Agencia: ");
        agencia = sc.nextLine();
        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o Saldo: ");
        saldo = sc.nextDouble();

        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia eh %s, conta %d e seu saldo R$%.2f ja esta disponivel para saque", nomeCliente, agencia, numero, saldo);
        sc.close();
    }
}
