package collections.list.operacoes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefasList;

    public ListaTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefasList = tarefas;
    }

    public ListaTarefas(){
        this(new ArrayList<Tarefa>());
    }

    public void adicionarTarefa(String descricao){
        this.tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemovidas = new ArrayList<>();
        for (Tarefa t: tarefasList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemovidas.add(t);
            }
        }
        tarefasList.removeAll(tarefasRemovidas);
    }

    public int contatarefas(ArrayList<Tarefa> tarefas){
      return tarefas.size();
    }

    public void imprimirDescricoesTarefas(){
        for (Tarefa t1: tarefasList){
            System.out.println(t1.getDescricao());
        }
    }


    public static void main(String[] args) {

        ArrayList<Tarefa> tarefaArrayList = new ArrayList<>();
        ListaTarefas listaDeTarefas = new ListaTarefas(tarefaArrayList);

        tarefaArrayList.add(new Tarefa("Tarefa 1"));
        listaDeTarefas.adicionarTarefa("Tarefa 2");
        Tarefa t3 = new Tarefa("Tarefa 3");

        listaDeTarefas.imprimirDescricoesTarefas();
        System.out.println("Quantidade de tarefas: "+listaDeTarefas.contatarefas(tarefaArrayList));
        System.out.println(t3);
    }

}