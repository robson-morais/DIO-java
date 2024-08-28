package uml;

import java.util.Scanner;

public class Phone {

    public static void call(Contato contato){
        System.out.printf("Ligando para %s",contato.getName());
    }

    private static Contato addContato(String nome, int num){

        String name = nome;
        int number = num;
        Contato c = new Contato(name, number);
        return c;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        boolean sair = false;
        while (!sair){
            System.out.println("1. Adicionar contato\n2. Ligar para contato");
            int opcao = Integer.parseInt(leitor.nextLine());
            switch (opcao){
                case 1:
                String nome = leitor.nextLine();
                int numero = Integer.parseInt(leitor.nextLine());
                System.out.println("Contato:\n"+(addContato(nome, numero)).toString());
                break;

                case 2:
                System.out.println("Nome ou número do contato: ");
                String contato = leitor.nextLine();
                System.out.println("Ligando para "+contato);

                case 3:
                sair = true;
                break;
            }
        }
    }



}
