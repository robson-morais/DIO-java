package collections.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void addEvento(LocalDate data, String nome, String atracao){
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        System.out.println(eventosTreeMap);
    }
    public void getNextEvent(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        for (Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual) ){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: "+proximoEvento+" acontecera na data "+proximaData);
                break;
            }
        }
    }

    public static void main(String[]args){
        AgendaEventos agenda = new AgendaEventos();
        agenda.addEvento(LocalDate.of(2024,7,19),"Show","Abel");
        agenda.addEvento(LocalDate.of(2025,Month.JANUARY,22),"Rock In Jampa","The Weeknd");
        agenda.addEvento(LocalDate.of(2024, Month.APRIL, 7),"Politica","Comicio");
        agenda.exibirAgenda();
        System.out.println("Próximos eventos: ");
        agenda.getNextEvent();
        
    }

}
