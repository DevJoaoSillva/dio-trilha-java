public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valr, Conta contaDestino);

    void imprimirExtrato();

}
