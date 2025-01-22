package org.generation.italy.jaita138.oop.model;

import java.time.LocalDate;

public class Professionista extends Persona {
    private String partitaIVA;
    private int fatturato;
    private LocalDate dataInizioAttività;
    
    public Professionista(String nome, String cognome, LocalDate dataNascita, String partitaIVA,
            LocalDate dataInizioAttività) {
        super(nome, cognome, dataNascita);
        if (partitaIVA.trim().length()==11)
            this.partitaIVA = partitaIVA;
        else
            throw new IllegalArgumentException("Partita IVA non valida");
        if (dataInizioAttività.isAfter(getDataNascita()) && 
            (dataInizioAttività.isBefore(LocalDate.now()) || dataInizioAttività.equals(LocalDate.now())))
            this.dataInizioAttività = dataInizioAttività;
        else
            throw new IllegalArgumentException("Data di inizio attività non valida"); 
        this.fatturato=0;
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

    public void fattura(int importo) {
        if (importo>0)
            fatturato+=importo;
        else
            throw new IllegalArgumentException("Importo non valido"); 
    }

    @Override
    public String toString() {
        return "Professionista [partitaIVA=" + partitaIVA + ", fatturato=" + fatturato
                + ", dataInizioAttività=" + dataInizioAttività + ", data di nascita="
                + getDataNascita() + ", nome=" + getNome() + ", cognome=" + getCognome()
                + "]";
    }
    

}
