package desafios.bootcamp;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n"+"Curso{" +super.getNome()+", Descrição = "+super.getDescricao()+
                " cargaHoraria = " + cargaHoraria +
                "}";
    }
}
