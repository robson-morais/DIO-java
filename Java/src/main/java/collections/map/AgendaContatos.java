package collections.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void cadastrarContato(String nome, Integer num){
        this.contatos.put(nome, num);
    }

    public void removerContato(String nome){
        if (!this.contatos.isEmpty()){
            this.contatos.remove(nome);
        }
    }

    public void exibirListaContatos(){
        System.out.println(this.contatos);
    }

    public Integer pequisarPorNome(String nome){
        Integer numByName = null;
        if (!this.contatos.isEmpty()){
            numByName = this.contatos.get(nome);
        }
        return numByName;
    }
}
