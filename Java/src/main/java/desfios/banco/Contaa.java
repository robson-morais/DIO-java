package desfios.banco;

public abstract class Contaa implements InterfaceConta {

    protected Cliente cliente;
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected static int SEQUENCIAL = 0;
    protected static final int AGENCIA_PADRAO = 1;

    public Contaa(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void creditar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Contaa contadestino) {
        this.sacar(valor);
        contadestino.creditar(valor);
    }

    protected void extratoPadrao(){
        System.out.printf("Número da conta: %d\nAgência: %d\nSaldo: R$ %.2f\n" +
                "Titular: %s\nconta corrente\n \n",this.conta,this.agencia,this.saldo,this.cliente.getNome());
    }

    public int getConta() {
        return conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getValor() {
        return saldo;
    }


}
