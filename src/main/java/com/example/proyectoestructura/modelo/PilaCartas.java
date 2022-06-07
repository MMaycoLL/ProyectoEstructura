package com.example.proyectoestructura.modelo;

import java.util.NoSuchElementException;

/**
 *
 * @author matychp
 * @param <P>
 */
public class PilaCartas<P extends Comparable> {

    private NodoPila<P> frente;

    public PilaCartas() {
        frente = null;
    }

    /**
     * Inserta una carta al inicio de la pila
     *  unInfo El dato a almacenar
     */
    public void push(P unInfo) {
        if (frente == null) {
            frente = new NodoPila<>(unInfo, null);
        } else {
            NodoPila<P> unNuevoNodo = new NodoPila<>(unInfo, frente);
            frente = unNuevoNodo;
        }
    }
    /**
     * Remueve el primer elemento de la pila sin retornarlo.
     */
    public void remove(){//No existe en Stack de Java
        if(frente != null){
            frente = frente.getNext();
        }
    }
    /**
     * Remueve el primer elemento de la pila retornandolo.
     * @return el primer elemento de la pila
     */
    public P pop(){
        if(frente == null){
            throw new NoSuchElementException();
        }
        else{
            P infoARetornar = frente.getInfo();
            frente = frente.getNext();
            return infoARetornar;
        }
    }
    /**
     * Devuelve si la pila esta vacia o no.
     *  true si la pila esta vacia, else si no lo está.
     */
    public boolean empty(){
        return frente == null;
    }
    /**
     * Utiliza el metodo advance() para recorrer la pila recursivamente
     * Este devuelve un String con todos los info's de los nodos.
     * @return el contenido de todos los info's de la pila, desde el primer elemento hasta el ultimo.
     */
    @Override
    public String toString(){
        return advance(frente);
    }


    /**
     * Avanza desde el primer elemento de la pila hasta el ultimo,
     * y luego empieza a acumular en el String r los info de esos Nodos.
     * @param unNodo
     * @return String r con todos los info's de los nodos de la Pila.
     */
    public String advance(NodoPila<P> unNodo){
        if(unNodo.getNext() != null){//Pregunto si el siguiente tiene un nodo más.
            String r = advance(unNodo.getNext());
            return unNodo.getInfo().toString() + "\n" + r;
        }
        return unNodo.getInfo().toString();
    }


}
