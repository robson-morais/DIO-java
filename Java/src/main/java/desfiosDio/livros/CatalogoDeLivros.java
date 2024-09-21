package desfiosDio.livros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoDeLivros {

    private List<Livro> livros;

    public CatalogoDeLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public CatalogoDeLivros() {
        this(new ArrayList<>());
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(new Livro("","",0));
    }
/*
    public String [] pesquisarPorAutor(String autor){
        int quant = this.livros.size();
        String [] autorLivros = new String[quant];
        for (int k=0; k<quant; k++){
            if (this.livros.get(k).getAutor().equalsIgnoreCase(autor)){
                autorLivros[k] = this.livros.get(k).getTitulo();
            }
        }
        return autorLivros;
    }*/

    public ArrayList<Livro> searchByAuthor(String autor){
        ArrayList<Livro> livrosAutor = new ArrayList<>();
        for (Livro l: this.livros){
            if (l.getAutor().equals(autor)){
                livrosAutor.add(l);
            }
        }
        return livrosAutor;
    }


    public static void main(String[] args) {

        Scanner cd = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        CatalogoDeLivros biblioteca = new CatalogoDeLivros(livros);

        for (int k=0; k<3; k++){
            String nome = cd.nextLine();
            String autor = cd.nextLine();
            int ano = 1990;
            Livro livro = new Livro(nome,autor,ano);
            livros.add(livro);
        }
        for (Livro li: livros){
            System.out.println(li.toString());
        }

        ArrayList<Livro> livrosTolstoi = biblioteca.searchByAuthor("Tolstoi");
        System.out.println("Livros do autor Liev Tolstoi: ");
        for (Livro l2: livrosTolstoi){
            System.out.println(l2.toString());
        }
    }
}
