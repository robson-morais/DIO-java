package desafios.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    @Override
    public String toString() {
        return "\nMentoria{" +super.getNome()+", Descrição = "+super.getDescricao()+
                " data=" + data +
                "}";
    }
}
