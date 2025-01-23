package org.generation.italy.jaita138.oop.model;

import java.time.LocalDate;

public class Fattura {
    private int numeroFattura;
    private LocalDate data;
    private String cliente;
    private double importo;

    public Fattura(int numeroFattura, LocalDate data, String cliente, double importo) {
        this.numeroFattura = numeroFattura;
        this.data = data;
        this.cliente = cliente;
        this.importo = importo;
    }

    public int getNumeroFattura() {
        return numeroFattura;
    }

    public void setNumeroFattura(int numeroFattura) {
        this.numeroFattura = numeroFattura;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    @Override
    public String toString() {
        return "Fattura{" +
                "numeroFattura=" + numeroFattura +
                ", data=" + data +
                ", cliente='" + cliente + '\'' +
                ", importo=" + importo +
                '}';
    }
}
