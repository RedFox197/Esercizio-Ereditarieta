package org.generation.italy.jaita138.oop.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Impiegato extends Persona {
    private String nrTesserino;
    private int stipendio;
    private LocalDate dataAssunzione;
    private HashMap<Integer, List<Cedolino>> cedoliniAnnui = new HashMap<>();

    public Impiegato(String nome, String cognome, LocalDate dataNascita, String nrTesserino,
                     int stipendio, LocalDate dataAssunzione, String username, String password) {
        super(nome, cognome, dataNascita, username, password);
        setNrTesserino(nrTesserino);
        setStipendio(stipendio);
        if (dataAssunzione.isAfter(getDataNascita()) &&
                (dataAssunzione.isBefore(LocalDate.now()) || dataAssunzione.equals(LocalDate.now())))
            this.dataAssunzione = dataAssunzione;
        else
            throw new IllegalArgumentException("Data di assunzione non valida");
    }

    public String getNrTesserino() {
        return nrTesserino;
    }

    public void setNrTesserino(String nrTesserino) {
        if (!nrTesserino.trim().isEmpty())
            this.nrTesserino = nrTesserino;
        else
            throw new IllegalArgumentException("Nr di tesserino non valido");
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        if (stipendio > 500)
            this.stipendio = stipendio;
        else
            throw new IllegalArgumentException("La schiavitù è illegale");
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void riceviAumento(int aumento) {
        if (aumento > 0)
            stipendio += aumento;
        else
            throw new IllegalArgumentException("Aumento non valido");
    }

    public void riceviCedolino(LocalDate date, double importo) {
        if (!cedoliniAnnui.containsKey(date.getYear())) {
            cedoliniAnnui.put(date.getYear(), new ArrayList<>());
        }

        List<Cedolino> list = cedoliniAnnui.get(date.getYear());
        list.add(new Cedolino(date, importo));
    }

    public void visualizzaCedolini(int anno) {
        List<Cedolino> list = cedoliniAnnui.get(anno);
        if (list != null) {
            System.out.println("Cedolini anno " + anno);
            list.forEach(System.out::println);
        } else {
            System.out.println("Nessun cedolino ricevuto nel " + anno);
        }
    }

    @Override
    public String toString() {
        return "Impiegato [nrTesserino=" + nrTesserino + ", stipendio=" + stipendio
                + ", data assunzione=" + dataAssunzione + ", data di nascita=" + getDataNascita()
                + ", nome=" + getNome() + ", cognome=" + getCognome() + "]";
    }


}
