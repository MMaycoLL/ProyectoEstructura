package com.example.proyectoestructura.modelo;

public class NodoPila< E extends Comparable >
{
    private E info;
    private NodoPila<E> next;

    public NodoPila( )
    {
    }

    public NodoPila(E x, NodoPila<E> p)
    {
        info = x;
        next = p;
    }

    public NodoPila<E> getNext()
    {
        return next;
    }

    public void setNext(NodoPila<E> p)
    {
        next = p;
    }

    public E getInfo()
    {
        return info;
    }

    public void setInfo(E p)
    {
        info = p;
    }

    @Override
    public String toString()
    {
        return info.toString();
    }
}