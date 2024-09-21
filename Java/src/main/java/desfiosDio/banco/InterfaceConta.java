package desfiosDio.banco;

public interface InterfaceConta {

    void sacar(double valor);
    void creditar (double valor);
    void transferir (double valor, Contaa contadestino);
    void imprimirExtrato();
    void imprimirExtratoJOP();
}
