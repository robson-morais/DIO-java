package collections.set.convidados;

import java.util.Objects;

public class Convite {
    private String nome;
    private int codigo;

    public Convite(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Convite() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Convidado {Nome: " + this.nome + ", Código: " + this.codigo + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convite convite = (Convite) o;
        return getCodigo() == convite.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    public static void main(String[] args) {
        Convite c = new Convite("Robson", 1425);
        System.out.println(c.toString());
    }
}