public class Main {
    public static void main(String[] args) {

        Cliente Joao = new Cliente();
        Joao.setNome("João Paulo");

        Conta cc = new ContaCorrente(Joao);
        Conta cp = new ContaPoupanca(Joao);


        cc.depositar(100);
        cp.depositar(100);
        cp.transferir(50, cc);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
