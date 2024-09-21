package desfiosDio.banco;
import javax.swing.JOptionPane;

public class Corrente extends Contaa {

    public Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta ===\n===Corrente");
        super.extratoPadrao();
    }

    @Override
    public void imprimirExtratoJOP() {
        String saldo = String.format("R$ %.2f",super.saldo);
        JOptionPane.showMessageDialog(null,"=== Extrato da Conta ===\n=== Corrente\n \nAgência: "+super.agencia+"\nNúmero da conta: "+super.conta+"\nSaldo: "+super.saldo+"\nTitular: "+super.cliente.getNome()+"\n \n");

    }
}
