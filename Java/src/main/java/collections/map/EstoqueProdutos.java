package collections.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void addProduto(long codigo, String nome, double preco, int quant){
        estoque.put(codigo, new Produto(nome, preco,quant));
    }

    public void exibirprodutos(){
        System.out.println(estoque);
    }

    public double calculaTotal(){
        double valortotal = 0;
        if (!estoque.isEmpty()){
            for (Produto p: estoque.values()){
                valortotal += p.getQuantidade()*p.getPreco();
            }
        }
        return valortotal;
    }

    public Produto getProdutomaiscaro(){
        Produto produtomaiscaro = null;
        double maiorpreco = Double.MIN_VALUE;

        for (Produto p: estoque.values()){
            if (p.getPreco()>maiorpreco){
                produtomaiscaro = p;
            }
        }
        return produtomaiscaro;
    }
}