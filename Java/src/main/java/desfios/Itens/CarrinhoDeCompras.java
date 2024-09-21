package desfios.Itens;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Item> itens;

    public CarrinhoDeCompras(ArrayList<Item> itens){
        this.itens = itens;
    }

    public CarrinhoDeCompras(){
        this(new ArrayList<>());
    }

    public void adicionarItem(Item item){
        this.itens.add(item);
    }

    public void adicionarItem(){
        this.itens.add(new Item("",0.0,0));
    }

    public void removerItem(String nome){
        ArrayList<Item> itensRemovidos = new ArrayList<>();
        for (Item item: this.itens){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensRemovidos.add(item);
            }
        }
        itens.removeAll(itensRemovidos);
    }
    public double calcularValorTotal(ArrayList<Item> compras){
        double total = 0.0;
        for (Item item: compras){
            total = item.getPreco()* item.getQuantidade();
        }
        return total;
    }

    public void exibirExtrato(){
        for (Item item: itens){
            System.out.printf("Produto: %s\nPreço: R$%.2f",item.getNome(),calcularValorTotal(itens));
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras tavares = new CarrinhoDeCompras();
        Item item1 = new Item("Leite",7.5,2);
        tavares.adicionarItem(item1);
        tavares.exibirExtrato();
    }
}