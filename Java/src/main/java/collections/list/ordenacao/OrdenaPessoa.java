package collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaPessoa {
    private List<Pessoa> pessoas;

    public OrdenaPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.pessoas.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenaPorIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }

    public List<Pessoa> ordenaPorAltura(){
        List<Pessoa> pessoasAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasAltura, new compararPorAltura());
        return pessoasAltura;
    }
}
