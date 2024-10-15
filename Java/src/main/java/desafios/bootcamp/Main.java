package desafios.bootcamp;

public class Main {

    public static void main(String [] args){

        Curso curso1 = new Curso();
        curso1.setNome("Curso 1");
        curso1.setDescricao("descrição curso1");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setNome("Curso 2");
        curso2.setDescricao("descrição curso2");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();
        mentoria1.setDescricao("Descrição mentoria 1");
        mentoria2.setDescricao("Descrição mentoria 2");


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcam Java com SprigBoot");
        bootcamp.setDescricao("Descrição do Bootcamp 1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev robs = new Dev();
        robs.setNome("Robs");
        robs.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos robs(incial)"+ robs.getConteudosInscritos());
        System.out.println("Robs xp inicial = "+robs.calcularTotalXp());
        System.out.println("-------------");
        robs.progredir();
        robs.progredir();
        System.out.println("Conteudos incritos robs(com XP)"+ robs.getConteudosInscritos());
        System.out.println("Conteudos concluidos robs"+ robs.getConteudosConcluidos());
        System.out.println("Robs xp atual = "+robs.calcularTotalXp());

        System.out.println("======================");

        Dev dev2 = new Dev();
        dev2.inscreverBootcamp(bootcamp);
        dev2.setNome("dev 2");
        System.out.println("Conteudos incritos dev2(incial)"+ dev2.getConteudosInscritos());
        System.out.println("-------------");
        dev2.progredir();
        System.out.println("Conteudos incritos dev2(com XP)"+ dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos dev2"+ dev2.getConteudosConcluidos());
        System.out.println("Dev 2 xp atual = "+dev2.calcularTotalXp());






    }
}