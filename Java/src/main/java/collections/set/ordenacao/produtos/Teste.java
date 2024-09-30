package collections.set.ordenacao.produtos;

public class Teste {
    public static void main(String[] args) {

        Compras minhasCompras = new Compras();

        // Adicionando 5 produtos diferentes
        minhasCompras.adicionarProduto("Arroz", 101, 20.50, 10);
        minhasCompras.adicionarProduto("Feijão", 102, 8.30, 5);
        minhasCompras.adicionarProduto("Macarrão", 103, 4.75, 12);
        minhasCompras.adicionarProduto("Azeite", 104, 18.90, 2);
        minhasCompras.adicionarProduto("Sal", 105, 2.50, 20);
        System.out.println(minhasCompras.exibirPorPreco());
        System.out.println(minhasCompras.exibirPorNome());
        System.out.println(minhasCompras.exibirAll());
    }
}
