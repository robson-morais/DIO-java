package collections.set.convidados;
import java.util.HashSet;
import java.util.Set;

public class Convidados {
    private Set<Convite> setDeConvites;

    public Convidados(){
        this.setDeConvites = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        this.setDeConvites.add(new Convite(nome,codigo));
    }

    public void removerConvidaddo(int codigo){
        Convite convidadoParaRemover = null;
        for (Convite convidado: setDeConvites){
            if (convidado.getCodigo() == codigo){
                convidadoParaRemover = (convidado);
            }
            break;
        }
        setDeConvites.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return this.setDeConvites.size();
    }

    public void exibirConvidados(){
        System.out.println(setDeConvites);
        //for (Convite c: this.setDeConvites){
        //    System.out.println(c.toString());}
    }

    public static void main(String[] args) {
        Convidados convidados = new Convidados();
        convidados.adicionarConvidado("Rob",10);
        convidados.adicionarConvidado("Bia",22);
        convidados.adicionarConvidado("Ben",22);
        convidados.adicionarConvidado("Jus",19);
        convidados.adicionarConvidado("Isha",15);

        convidados.exibirConvidados();
        System.out.println("Foram convidadas "+convidados.contarConvidados()+" pessoas");
    }
}
