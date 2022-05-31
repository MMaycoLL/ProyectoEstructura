package com.example.proyectoestructura.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Grafo<T> {

    private ArrayList<Nodo> nodos;

    public Grafo() {
        nodos = new ArrayList<>();
    }

    public void agregarNodo(String nombre, T t) {
        if (buscarNodo(nombre) == null) {
            nodos.add(new Nodo(nombre, t));
        }
    }

    public Nodo buscarNodo(String nombre) {
        for (Nodo vertice : nodos) {
            if (vertice.getNombre().equals(nombre)) {
                return vertice;
            }
        }
        return null;
    }

    public void eliminarVertice(String nombre) {
        Nodo<T> verticeOrigen = buscarNodo(nombre);
        if (verticeOrigen == null) {
            return;
        }
        for (Nodo<T> vertice : nodos) {
            // Eliminamos todos los arcos donde el vertice a borrar sea un destino.
            vertice.eliminarArco(verticeOrigen.getNombre());
        }
        // Finalmente eliminamos el vertice.
        nodos.remove(verticeOrigen);
    }

    public void nuevoArco(String origen, String destino, double peso) {
        Nodo<T> verticeOrigen = buscarNodo(origen);
        Nodo<T> verticeDestino = buscarNodo(destino);

        if (verticeOrigen != null && verticeDestino != null) {
            verticeOrigen.agregarArco(verticeDestino, peso);
        }
    }

    public void eliminarArco(String origen, String destino) {
        Nodo<T> verticeOrigen = buscarNodo(origen);
        if (verticeOrigen != null) {
            verticeOrigen.eliminarArco(destino);
        }
    }

    public boolean adyacente(String origen, String destino) {
        Nodo<T> verticeOrigen = buscarNodo(origen);

        if (verticeOrigen != null) {
            return verticeOrigen.buscarDestino(destino) != null;
        }

        return false;
    }

    public double pesoEntreArcos(String origen, String destino) {
        Nodo<T> verticeOrigen = buscarNodo(origen);

        if (verticeOrigen != null) {
            Nodo<T> verticeDestino = verticeOrigen.buscarDestino(destino);
            for (Arista arco : verticeOrigen.getAristas()) {
                if (arco.getDestino().equals(verticeDestino)) {
                    return arco.getPeso();
                }
            }
        }

        return 0.0;
    }

    public int[][] obtenerMatrizAdyacencia() {
        int[][] matriz = new int[nodos.size()][nodos.size()];
        for (int h = 0; h < nodos.size(); h++) {
            Nodo<T> verticeY = nodos.get(h);
            for (int w = 0; w < nodos.size(); w++) {
                Nodo<T> verticeX = nodos.get(w);
                if (adyacente(verticeY.getNombre(), verticeX.getNombre())) {
                    matriz[h][w] = 1;
                } else {
                    matriz[h][w] = 0;
                }
            }
        }

        return matriz;
    }

    public double[][] obtenerMatrizPesos() {
        double[][] matriz = new double[nodos.size()][nodos.size()];
        for (int h = 0; h < nodos.size(); h++) {
            Nodo<T> verticeY = nodos.get(h);
            for (int w = 0; w < nodos.size(); w++) {
                Nodo<T> verticeX = nodos.get(w);
                if (adyacente(verticeY.getNombre(), verticeX.getNombre())) {
                    matriz[h][w] = pesoEntreArcos(verticeY.getNombre(), verticeX.getNombre());
                } else {
                    matriz[h][w] = 0.0;
                }
            }
        }

        return matriz;
    }

    public String toString() {
        String vertices = "V = {";
        for (Nodo<T> vertice : this.nodos) {
            vertices += " \"" + vertice.getNombre() + "\",";
        }
        vertices += "}\n";

        String adyacencia = "A = {\n";
        for (int[] row : obtenerMatrizAdyacencia()) {
            adyacencia += "\t[";
            for (int item : row) {
                adyacencia += item + ",";
            }
            adyacencia += "]\n";
        }
        adyacencia += "}\n";

        String pesos = "P = {\n";
        for (double[] row : obtenerMatrizPesos()) {
            pesos += "\t[";
            for (double item : row) {
                pesos += item + ", ";
            }
            pesos += "]\n";
        }
        pesos += "}\n";

        return vertices + adyacencia + pesos;
    }

    public int[][] matrizCaminos() {
        int n = nodos.size();
        int[][] caminos = obtenerMatrizAdyacencia();

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    caminos[i][j] = Math.min(caminos[i][j] + caminos[i][k] * caminos[k][j], 1);
                }
            }
        }
        return caminos;
    }

    public int getVerticeIndice(String origen) {
        for (int i = 0; i < nodos.size(); i++) {
            if (nodos.get(i).getNombre().equals(origen)) {
                return i;
            }
        }
        return -1;
    }

    public List<Nodo<T>> rutaMasCorta(Nodo<T> origen, Nodo<T> destino) {
        resetMinDistanceEnVertices();
        calcularCaminos(origen);
        return obtenerCaminoMasCorto(destino);
    }

    private void resetMinDistanceEnVertices() {
        for (Nodo<T> vertice : nodos) {
            vertice.setMinDistance(Double.POSITIVE_INFINITY);
            vertice.setPrevio(null);
        }
    }

    private void calcularCaminos(Nodo<T> source) {
        source.setMinDistance(0.0);
        PriorityQueue<Nodo<T>> vertexQueue = new PriorityQueue<>();
        vertexQueue.add(source);

        while (!vertexQueue.isEmpty()) {
            Nodo<T> poll = vertexQueue.poll();

            // Visit each edge exiting u
            for (Object element : poll.getAristas()) {
                Arista arco = (Arista) element;
                Nodo<T> v = arco.getDestino();
                double weight = arco.getPeso();
                double distanceThroughU = poll.getMinDistance() + weight;
                if (distanceThroughU < v.getMinDistance()) {
                    vertexQueue.remove(v);

                    v.setMinDistance(distanceThroughU);
                    v.setPrevio(poll);
                    vertexQueue.add(v);
                }
            }
        }
    }

    private List<Nodo<T>> obtenerCaminoMasCorto(Nodo<T> target) {
        List<Nodo<T>> path = new ArrayList<>();
        for (Nodo<T> vertex = target; vertex != null; vertex = vertex.getPrevio()) {
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }

}
