package com.example.proyectoestructura.modelo;

import javafx.scene.image.ImageView;

public class Jugador {
    ImageView cartaSacada;

    public Jugador(ImageView cartaSacada) {
        this.cartaSacada = cartaSacada;
    }

    public ImageView getCartaSacada() {
        return cartaSacada;
    }

    public void setCartaSacada(ImageView cartaSacada) {
        this.cartaSacada = cartaSacada;
    }
}
