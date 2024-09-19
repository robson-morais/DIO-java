package collections.list.operacoes;

public class Tarefa {

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa() {
        this("");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return "Descrição: "+this.descricao;
    }
}
