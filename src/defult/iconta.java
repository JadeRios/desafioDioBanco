package defult;

public interface iconta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, conta destino);
    void imprimirExtrato();
}
