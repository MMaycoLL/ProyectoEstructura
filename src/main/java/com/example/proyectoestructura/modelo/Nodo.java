package com.example.proyectoestructura.modelo;

import java.util.ArrayList;

public class Nodo<T> implements Comparable<Nodo<T>> {

    private T t;
    private String nombre;
    private ArrayList<Arista> aristas;
    private double minDistance = Double.POSITIVE_INFINITY;
    private Nodo<T> previo;

    public Nodo(String nombre, T t) {
        this.t = t;
        this.nombre = nombre;
        aristas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarArco(Nodo<T> destino, double peso) {
        Nodo<T> verticeDestino = buscarDestino(destino.getNombre());
        if (verticeDestino == null) {
            aristas.add(new Arista(destino, peso));
        }
    }

    public void eliminarArco(String destino) {
        Arista arcoBuscado = null;
        for (Arista arco : aristas) {
            if (arco.getDestino().getNombre().equals(destino)) {
                arcoBuscado = arco;
            }
        }
        aristas.remove(arcoBuscado);
    }

    public Nodo<T> buscarDestino(String destino) {
        for (Arista arco : aristas) {
            if (arco.getDestino().getNombre().equals(destino)) {
                return arco.getDestino();
            }
        }
        return null;
    }

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public boolean equals(Nodo vertice) {
        return nombre.equals(vertice.nombre);
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public Nodo<T> getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo<T> previo) {
        this.previo = previo;
    }

    @Override
    public int compareTo(Nodo<T> vertice) {
        return Double.compare(this.getMinDistance(), vertice.getMinDistance());
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
