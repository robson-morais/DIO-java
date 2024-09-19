package desfiosDio.src.main.java.collections.tarefas;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefa> listaDeTarefas;

    public ListaTarefas(ArrayList<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public ArrayList<Tarefa> getListaDeTarefas() {
        return listaDeTarefas;
    }

    public void setListaDeTarefas(ArrayList<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public void adicionarTarefa(String descricao){
        this.listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        ArrayList<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: listaDeTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroDeTarefas(ArrayList<Tarefa> tarefas){
        return tarefas.size();
    }

    public void imprimeDescricao(){
        for (Tarefa t: listaDeTarefas){
            System.out.println(t.toString());
        }
    }


}
