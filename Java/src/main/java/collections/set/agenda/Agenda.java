package collections.set.agenda;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Contato> contatosSet;

    public Agenda(){
        this.contatosSet = new HashSet<>();
    }


    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome,numero));
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosNome = new HashSet<>();
        for (Contato c: contatosSet){
            if (c.getNome().startsWith(nome)){
                contatosNome.add(c);
            } // Maria Helena, Maria Ana, Maria Joana;
        }
        return contatosNome;
    }

    public void atualizarNumero(String nome, int newNumero){
        for (Contato ct: contatosSet){
            if (ct.getNome().equalsIgnoreCase(nome)){
                ct.setNumero(newNumero);
                break;
            }
        }
    }

    public void exibirContatos(){
        System.out.println(this.contatosSet);
    }
}
