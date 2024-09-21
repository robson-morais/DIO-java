package testes;

import java.util.Scanner;

public class controleSimplesDeSaques {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double limiteDiario = Double.parseDouble(scanner.nextLine());

        // Loop for para iterar sobre os saques
        for (int i = 0; i < 3; i++) {

            double saque = Double.parseDouble(scanner.nextLine());

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");

            } else if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");

            } else if (saque < limiteDiario){
                limiteDiario -= saque;
                System.out.printf("Saque realizado. Limite restante: %.1f\nTransacoes encerradas.",limiteDiario);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}