package banco;

import java.util.Scanner;

public class contaBanco {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do cliente: ");
        String nomeCliente = leitor.nextLine();

        System.out.println("Digite os quatro números da AGÊNCIA no formato '012-3': ");
        String agencia = leitor.nextLine();

        System.out.println("Digite os quatro números da CONTA: ");
        int conta = Integer.parseInt(leitor.nextLine());

        double saldo = 0.0; //*saldo inicial
        
        System.out.printf("Olá, %s!"+" Obrigado por criar uma conta em nosso banco. Sua Agência é %s"+", conta %d"+" e seu saldo é R$ %.2f",nomeCliente,agencia,conta,saldo);

        leitor.close();
    }
}
