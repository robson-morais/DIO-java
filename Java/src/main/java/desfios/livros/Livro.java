package desfios.livros;


// título, autor e ano de publicação
public class Livro {

    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public Livro(){
        this("","",0);
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String toString() {
        return "Título: '"+this.titulo+"'\nAutor: "+this.autor+"\nAno de publicação: "+this.anoDePublicacao;
    }

    public static void main(String[] args) {
        Livro livro = new Livro("A morte de Ivan Illitch","Liev Tolstói",1892);
        System.out.println(livro.toString());
    }
}