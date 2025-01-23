package org.generation.italy.jaita138.oop.model;

import java.time.LocalDate;

public class Cedolino {
    private LocalDate date;
    private double importo;

    public Cedolino(LocalDate date, double importo) {
        this.date = date;
        this.importo = importo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    @Override
    public String toString() {
        return "Cedolino{" +
                "date=" + date +
                ", importo=" + importo +
                '}';
    }
}
