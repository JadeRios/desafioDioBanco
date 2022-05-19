package defult;

public class main {

    public static void main(String[] args) {
        cliente clienteNovo = new cliente();
        clienteNovo.setNome("Jade");

        conta cc = new contaCorrente(clienteNovo);
        conta poupanca = new contaPoupanca(clienteNovo);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

