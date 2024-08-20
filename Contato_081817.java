package uml;

public class Contato {

    private String name;
    private int number;

    public Contato (String nome, int numero){
        this.name = nome;
        this.number = numero;
    }



    public Contato(){
        this("",0);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    
    public String toString(){
        return this.name+"\n"+this.number;
    }
}