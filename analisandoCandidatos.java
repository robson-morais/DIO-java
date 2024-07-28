package testeCandidatura;

import java.util.concurrent.ThreadLocalRandom;

public class analisandoCandidatos {
    public static void main(String[] args) throws Exception {
        selecionandoCandidatos();
    }

    static void analisandoCandidato (Double salarioPretendido) {

        double salarioOfertado = 2000.0;

        if (salarioPretendido<salarioOfertado) {
            System.out.println("Ligar para o candidato");

        } else if (salarioPretendido==salarioOfertado) {
            System.out.println("Ligar para o candidato com contra proposta");

        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void selecionandoCandidatos (){
        String [] candidatos = {"Ana", "João", "Marcia", "Maria","José","Juliana"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados <5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+" solicitou este valor de salário: "+salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
}