package testes;

import java.util.Scanner;

public class converterDados {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        // GB to Mb:
        int gb = Integer.parseInt(rd.nextLine());
        int mb = (int) (gb*(Math.pow(1024,2)))/1024;
        /*if(gb<999){
            mb = (int) (gb*(Math.pow(1024,2)))/1024;
        }*/

        System.out.println(mb);
    }
}
