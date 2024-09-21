package desfios.banco;

import java.util.List;

public class BancioDio {

    private String nome;
    private List<Contaa> contas;

    public List<Contaa> getContas() {
        return contas;
    }

    public void setContas(List<Contaa> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
