package collections.set.agenda;
import java.util.Set;
import java.util.HashSet;

public class testa {
    public static void main(String[] args) {

        Agenda contatos = new Agenda();

        contatos.adicionarContato("Robson",11111111);
        contatos.adicionarContato("Rob", 22222);
        contatos.adicionarContato("Robson Silva",3333);
        contatos.adicionarContato("Joana",44444);
        contatos.adicionarContato("Rob Stark",55555);

        contatos.exibirContatos();

        System.out.println(contatos.pesquisarPorNome("Robson"));/*
        for (Contato c: robson){
            System.out.println(c.toString());
        }*/


    }
}
