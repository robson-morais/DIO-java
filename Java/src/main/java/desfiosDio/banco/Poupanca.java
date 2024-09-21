package desfiosDio.banco;

import javax.swing.*;

public class Poupanca extends Contaa {
    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta ===\n=== Poupança");
        super.extratoPadrao();
    }

    @Override
    public void imprimirExtratoJOP() {
        String saldo = String.format("R$ %.2f",super.saldo);
        JOptionPane.showMessageDialog(null,"=== Extrato da Conta ===\n=== Poupança\n \nAgência: "+super.agencia+"\nNúmero da conta: "+super.conta+"\nSaldo: "+super.saldo+"\nTitular: "+super.cliente.getNome()+"\n \n");

    }
}