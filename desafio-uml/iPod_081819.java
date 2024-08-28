package uml;

import java.util.Scanner;

public class iPod {
    public static void playing(){
        System.out.println("Tocando a faixa");
    }

    public static void pause(){
        System.out.println("Faixa em pausa");
    }

    public static void nextSong(){
        System.out.println("Tocando a próxima faixa");
    }

    public static void previousSong(){
        System.out.println("Tocando a faixa anterior");
    }

    public static void volumeUp(){
        System.out.println("Aumentando volume");
    }
    public static void volumeDown(){
        System.out.println("Diminuindo o volume");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
  
        boolean sair = false;
        while (!sair){
            System.out.println("Opções do player:\n1. Tocar\n2. Pausar\n3. Próxima faixa\n4. Faixa anterior\n5. Aumentar volume\n6. Diminiur volume\n7. Sair");
            int opcao =  Integer.parseInt(scan.nextLine());
            switch (opcao) {
                case 1:
                    playing();
                    break;
                case 2:
                    pause();
                    break;
                case 3:
                    nextSong();
                    break;
                case 4:
                    previousSong();
                    break;
                case 5:
                    volumeUp();
                    break;
                case 6:
                    volumeDown();
                    break;
                case 7:
                    sair = true;
                    break;
            }
        }
    }
}
