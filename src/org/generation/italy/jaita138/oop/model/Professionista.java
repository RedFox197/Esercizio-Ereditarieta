package org.generation.italy.jaita138.oop.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Professionista extends Persona {
    private String partitaIVA;
    private int fatturato;
    private LocalDate dataInizioAttività;
    private HashMap<Integer, List<Fattura>> fattureAnnue = new HashMap<>();

    public Professionista(String nome, String cognome, LocalDate dataNascita, String partitaIVA,
                          LocalDate dataInizioAttività, String username, String password) {
        super(nome, cognome, dataNascita, username, password);
        if (partitaIVA.trim().length() == 11)
            this.partitaIVA = partitaIVA;
        else
            throw new IllegalArgumentException("Partita IVA non valida");
        if (dataInizioAttività.isAfter(getDataNascita()) &&
                (dataInizioAttività.isBefore(LocalDate.now()) || dataInizioAttività.equals(LocalDate.now())))
            this.dataInizioAttività = dataInizioAttività;
        else
            throw new IllegalArgumentException("Data di inizio attività non valida");
        this.fatturato = 0;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public int getFatturato() {
        return fatturato;
    }

    public LocalDate getDataInizioAttività() {
        return dataInizioAttività;
    }

    public void emettiFattura(LocalDate data, String cliente, double importo) {
        if (!data.isBefore(dataInizioAttività))  {
            throw new IllegalArgumentException("Non puoi emettere una fattura prima di aver iniziato l'attività");
        }

        if (!fattureAnnue.containsKey(data.getYear())) {
            fattureAnnue.put(data.getYear(), new ArrayList<>());
        }

        List<Fattura> listaFatture = fattureAnnue.get(data.getYear());
        int numeroFattura = listaFatture.size() + 1;
        Fattura fattura = new Fattura(numeroFattura, data, cliente, importo);
        listaFatture.add(fattura);
    }

    public void visualizzaFatture() {
        for (Map.Entry<Integer, List<Fattura>> entry : fattureAnnue.entrySet()) {
            System.out.println("Fatture anno " + entry.getKey());
            entry.getValue().forEach(System.out::println);
        }
    }

    public void visualizzaFatture(String client) {
        for (Map.Entry<Integer, List<Fattura>> entry : fattureAnnue.entrySet()) {
            List<Fattura> tf = entry.getValue()
                    .stream()
                    .filter(fattura -> fattura.getCliente().equals(client))
                    .toList();

            if (!tf.isEmpty()) {
                System.out.println("Fatture anno " + entry.getKey() + " di " + client);
                tf.forEach(System.out::println);
            }

        }
    }

    @Override
    public String toString() {
        return "Professionista [partitaIVA=" + partitaIVA + ", fatturato=" + fatturato
                + ", dataInizioAttività=" + dataInizioAttività + ", data di nascita="
                + getDataNascita() + ", nome=" + getNome() + ", cognome=" + getCognome()
                + "]";
    }


}
