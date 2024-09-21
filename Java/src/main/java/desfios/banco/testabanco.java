package desfios.banco;
import javax.swing.JOptionPane;

public class testabanco {

    public static void main(String[] args) {
        boolean start = false;
        while (!start){
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "O que deseja fazer? \n1. Criar Conta Corrente\n2. Criar Conta Poupança\n3. Sair"));
            switch (menu){
                case 1:
                    String nomeCC = JOptionPane.showInputDialog(null,"Digite o seu nome: ");
                    String cpfCC = JOptionPane.showInputDialog(null,"Digite os 11 números do seu CPF: ");
                    while (cpfCC.length() != 11){
                        cpfCC = JOptionPane.showInputDialog(null,"O número está incorreto.\nDigite os 11 números do seu CPF: ");
                    }
                    Cliente clienteCC = new Cliente(nomeCC,cpfCC);
                    Contaa contaCorrente = new Corrente(clienteCC);
                    contaCorrente.imprimirExtratoJOP();
                    break;
                case 2:
                    String nomePP = JOptionPane.showInputDialog(null,"Digite o seu nome: ");
                    String cpfPP = JOptionPane.showInputDialog(null,"Digite os 11 números do seu CPF: ");
                    while (cpfPP.length() != 11){
                        cpfPP = JOptionPane.showInputDialog(null,"O número está incorreto.\nDigite os 11 números do seu CPF: ");
                    }
                    Cliente clientePP = new Cliente(nomePP,cpfPP);
                    Contaa contaPoupanca = new Poupanca(clientePP);
                    contaPoupanca.imprimirExtratoJOP();
                    break;
                case 3:
                    start = true;
                    break;
            }

        }

    }
}