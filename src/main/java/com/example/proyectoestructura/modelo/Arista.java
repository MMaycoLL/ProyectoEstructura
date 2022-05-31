package com.example.proyectoestructura.modelo;

public class Arista {

    private Nodo destino;
    private double peso;

    public Arista(Nodo destino) {
        this.destino = destino;
        this.peso = 0.0;
    }

    public Arista(Nodo destino, double peso) {
        this(destino);
        this.peso = peso;
    }

    public void setPeso(double peso) {
        this.peso += peso;
    }

    public Nodo getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    public boolean equals(Object n) {
        Arista a = (Arista) n;
        return destino == a.destino;
    }
}