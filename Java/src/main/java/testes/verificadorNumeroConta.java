package testes;

import java.util.Scanner;

public class verificadorNumeroConta {

    private static String verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() != 8)
            throw new IllegalArgumentException();
        return "Erro: Numero de conta invalido. Digite exatamente 8 digitos.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.nextLine();
            String contaFormatada = verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        } finally {
            scanner.close();
        }
    }
}