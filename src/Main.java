public class Main {
    public static void main(String[] args) {

        Cliente denilson = new Cliente("Denilson");
        Cliente joao = new Cliente("João");
        Conta cc = new ContaCorrente(denilson);
        Conta cp = new ContaPoupanca(joao);

        cc.depositar(80.23);

        cc.transferir(34.56,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}