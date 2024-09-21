package testes;

import java.util.Objects;
import java.util.Scanner;

public class verificacaoDeServicos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        String servico = leitor.nextLine();
        String[] servicos = servico.split(",");
        // String [] nomes = new String [quant];
        int cont = 0;


        for (int i = 0; i < servicos.length; i++) {
            if (Objects.equals(nome, servicos[i])) {
                cont += 1;
            }
        }
        if (cont > 0) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
            leitor.close();
        }
    }
}