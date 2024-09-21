package testes;

import java.util.Objects;
import java.util.Scanner;

public class servicosContratados {

    public static String verificarComboCompleto(String[] servicosContratados) {
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // TODO: Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
            if (Objects.equals(servico, "movel")){
                movelContratado = true;
            } if (Objects.equals(servico, "banda larga")){
                bandaLargaContratada = true;
            } if (Objects.equals(servico, "tv")){
                tvContratada = true;
            }
        }

        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}