package collections.set.ordenacao.produtos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Compras {
    private Set<Produto> produtos;

    public Compras() {
        this.produtos = new HashSet<>();
    }
    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        this.produtos.add(new Produto(nome,codigo,preco,quantidade));
    }

    public Set<Produto> exibirPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

    public Set<Produto> exibirAll(){
        return this.produtos;
    }
}
