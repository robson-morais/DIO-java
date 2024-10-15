package desafios.bootcamp;

public class Main {

    public static void main(String [] args){

        Conteudo curso1 = new Curso();
        curso1.setNome("Curso 1");
        curso1.setDescricao("descrição curso1");
        Curso curso2 = new Curso();
        curso2.setNome("Curso 2");
        curso2.setDescricao("descrição curso2");


        Conteudo mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcam Java com SprigBoot");
        bootcamp.setDescricao("Descrição do Bootcamp 1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev robs = new Dev();
        robs.setNome("Robs");
        robs.inscreverBootcamp(bootcamp);
        robs.progredir();
        System.out.println("Conteudos incritos robs\n"+ robs.getConteudosInscritos());
        System.out.println("Conteudos concluidos robs\n"+ robs.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.setNome("dev 2");
        System.out.println("Conteudos incritos dev2\n"+ dev2.getConteudosInscritos()+"\n ");
        System.out.println("Conteudos concluidos dev2\n"+ dev2.getConteudosConcluidos());







    }
}