package testes;

import javax.management.ObjectInstance;
import java.util.Scanner;

public class simulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Bem vindo");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Encerrar");
            int opcao = Integer.parseInt(scanner.nextLine());


            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    double deposito = Double.parseDouble(scanner.nextLine());
                    saldo += deposito;
                    System.out.printf("Saldo atual %.1f\n",saldo);
                    break;
                case 2:
                    double saque = Double.parseDouble(scanner.nextLine());
                    if (saque<=saldo){
                        saldo -= saque;
                        System.out.printf("Saldo atual %.1f\n",saldo);
                    } else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n",saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}