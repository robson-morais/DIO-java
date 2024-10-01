package collections.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa(){
        this("",0,0.0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int compareTo(Pessoa p){
        return Integer.compare(this.idade, p.getIdade());
    }

    @Override
    public String toString() {
        return "Pessoa {Nome: "+this.nome+", Idade: "+this.idade+", Altura: "+this.altura+"}\n";
    }
}
class compararPorAltura implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa a, Pessoa b) {
        return Double.compare(a.getAltura(), b.getAltura());
    }
}