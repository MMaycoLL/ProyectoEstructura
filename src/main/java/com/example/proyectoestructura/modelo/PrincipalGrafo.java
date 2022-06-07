package com.example.proyectoestructura.modelo;

public class PrincipalGrafo {

    private Grafo<String> grafo = new Grafo<>();
    public PrincipalGrafo() {

        String[] palabras = new String[]{"Centro", "Verde", "Azul", "Amarillo", "Rojo", "Naranja", "Violeta"};
        crearHexagonos(grafo, palabras);
        unirHexagonos(grafo);

        System.out.println(grafo);

        System.out.println(grafo.rutaMasCorta(grafo.buscarNodo("Amarillo-Occidente"), grafo.buscarNodo("Violeta-Oriente")));
        //System.out.println(grafo.pesoEntreArcos("Amarillo-Occidente", "Violeta-Oriente"));
      //  asignarSemaforo("Amarillo-Oriente");
        //System.out.println(grafo.pesoEntreArcos("Amarillo-Occidente", "Violeta-Oriente"));
    }

    public void asignarSemaforo (String nodo){
        Nodo nodoActual = grafo.buscarNodo(nodo);

        nodoActual.setCentinela(true);
    }
    private static void unirHexagonos(Grafo<String> grafo) {
        double peso = 1.0;
        grafo.nuevoArco("Verde-Sur-Oriente", "Centro-Norte-Occidente", peso);

        grafo.nuevoArco("Centro-Norte-Oriente", "Azul-Sur-Occidente", peso);
        grafo.nuevoArco("Azul-Sur-Occidente", "Centro-Norte-Oriente", peso);

        grafo.nuevoArco("Centro-Oriente", "Violeta-Occidente", peso);
        grafo.nuevoArco("Violeta-Occidente", "Centro-Oriente", peso);

        grafo.nuevoArco("Centro-Norte-Occidente", "Verde-Sur-Oriente", peso);
        grafo.nuevoArco("Verde-Sur-Oriente", "Centro-Norte-Occidente", peso);

        grafo.nuevoArco("Centro-Norte-Oriente", "Azul-Sur-Occidente", peso);
        grafo.nuevoArco("Azul-Sur-Occidente", "Centro-Norte-Oriente", peso);

        grafo.nuevoArco("Centro-Oriente", "Violeta-Occidente", peso);
        grafo.nuevoArco("Violeta-Occidente", "Centro-Oriente", peso);

        grafo.nuevoArco("Centro-Sur-Oriente", "Rojo-Norte-Occidente", peso);
        grafo.nuevoArco("Rojo-Norte-Occidente", "Centro-Sur-Oriente", peso);

        grafo.nuevoArco("Centro-Sur-Occidente", "Naranja-Norte-Oriente", peso);
        grafo.nuevoArco("Naranja-Norte-Oriente", "Centro-Sur-Occidente", peso);

        grafo.nuevoArco("Centro-Occidente", "Amarillo-Oriente", peso);
        grafo.nuevoArco("Amarillo-Oriente", "Centro-Occidente", peso);

        grafo.nuevoArco("Amarillo-Norte-Oriente", "Verde-Sur-Occidente", peso);
        grafo.nuevoArco("Verde-Oriente", "Azul-Occidente", peso);
        grafo.nuevoArco("Azul-Sur-Oriente", "Violeta-Norte-Occidente", peso);
        grafo.nuevoArco("Violeta-Sur-Occidente", "Rojo-Norte-Oriente", peso);
        grafo.nuevoArco("Rojo-Occidente", "Naranja-Oriente", peso);
        grafo.nuevoArco("Naranja-Norte-Occidente", "Amarillo-Sur-Oriente", peso);
    }

    private static void crearHexagonos(Grafo<String> grafo, String[] palabras) {
        double peso;
        for (String palabra : palabras) {
            if (palabra.equals("Centro"))
                peso = 3.0;
            else
                peso = 2.0;
            grafo.agregarNodo(palabra + "-Norte-Occidente", "Contenido generico del vertice");
            grafo.agregarNodo(palabra + "-Norte-Oriente", "Contenido generico del vertice");
            grafo.agregarNodo(palabra + "-Oriente", "Contenido generico del vertice");
            grafo.agregarNodo(palabra + "-Sur-Oriente", "Contenido generico del vertice");
            grafo.agregarNodo(palabra + "-Sur-Occidente", "Contenido generico del vertice");
            grafo.agregarNodo(palabra + "-Occidente", "Contenido generico del vertice");

            grafo.nuevoArco(palabra + "-Norte-Oriente", palabra + "-Norte-Occidente", peso);
            grafo.nuevoArco(palabra + "-Norte-Occidente", palabra + "-Occidente", peso);
            grafo.nuevoArco(palabra + "-Occidente", palabra + "-Sur-Occidente", peso);
            grafo.nuevoArco(palabra + "-Sur-Occidente", palabra + "-Sur-Oriente", peso);
            grafo.nuevoArco(palabra + "-Sur-Oriente", palabra + "-Oriente", peso);
            grafo.nuevoArco(palabra + "-Oriente", palabra + "-Norte-Oriente", peso);
        }

    }
}