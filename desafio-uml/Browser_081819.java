package uml;

public class Browser {

  public static void main(String[]args){
    System.out.println("Pesquisar: ");
    if (validateConection){
      System.out.println("Mostrando resultados da pesquisa...");
    } else {
      System.out.println("Voçê não está conectado a Internet");
    }
  }
}
