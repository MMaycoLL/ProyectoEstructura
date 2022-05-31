package com.example.proyectoestructura.controlador;

import com.example.proyectoestructura.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class ControladorPrincipal {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    //posiciones puntos//
    @FXML
    private ImageView AmarilloNorteOccidente;

    @FXML
    private ImageView AmarilloNorteOriente;

    @FXML
    private ImageView AmarilloOccidente;

    @FXML
    private ImageView AmarilloOccidente1;

    @FXML
    private ImageView AmarilloOriente;

    @FXML
    private ImageView AmarilloSurOccidente;

    @FXML
    private ImageView AmarilloSurOriente;

    @FXML
    private ImageView AzulNorteOccidente;

    @FXML
    private ImageView AzulNorteOriente;

    @FXML
    private ImageView AzulOccidente;

    @FXML
    private ImageView AzulOriente;

    @FXML
    private ImageView AzulSurOccidente;

    @FXML
    private ImageView AzulSurOriente;

    @FXML
    private ImageView CentroNorteOccidente;

    @FXML
    private ImageView CentroNorteOriente;

    @FXML
    private ImageView CentroOccidente;

    @FXML
    private ImageView CentroOriente;

    @FXML
    private ImageView CentroSurOccidente;

    @FXML
    private ImageView CentroSurOriente;

    @FXML
    private ImageView NaranjaNorteOccidente;

    @FXML
    private ImageView NaranjaNorteOriente;

    @FXML
    private ImageView NaranjaOccidente;

    @FXML
    private ImageView NaranjaOriente;

    @FXML
    private ImageView NaranjaSurOccidente;

    @FXML
    private ImageView NaranjaSurOriente;

    @FXML
    private ImageView RojoNorteOccidente;

    @FXML
    private ImageView RojoNorteOriente;

    @FXML
    private ImageView RojoOccidente;

    @FXML
    private ImageView RojoOriente;

    @FXML
    private ImageView RojoSurOccidente;

    @FXML
    private ImageView RojoSurOriente;

    @FXML
    private ImageView VerdeNorteOccidente;

    @FXML
    private ImageView VerdeNorteOriente;

    @FXML
    private ImageView VerdeOccidente;

    @FXML
    private ImageView VerdeOriente;

    @FXML
    private ImageView VerdeSurOccidente;

    @FXML
    private ImageView VerdeSurOriente;

    @FXML
    private ImageView VioletaNorteOccidente;

    @FXML
    private ImageView VioletaNorteOriente;

    @FXML
    private ImageView VioletaOccidente;

    @FXML
    private ImageView VioletaOriente;

    @FXML
    private ImageView VioletaSurOccidente;

    @FXML
    private ImageView VioletaSurOriente;

    @FXML
    private ImageView dado1;

    @FXML
    private ImageView dado2;

    // Agregar Semaforos//
    @FXML
    void agregarSemaforoAmarilloNorteOccidente(MouseEvent event) {
 Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AmarilloNorteOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoAmarilloNorteOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AmarilloNorteOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoAmarilloOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AmarilloOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoAmarilloOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AmarilloOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoAmarilloSurOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AmarilloSurOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoAmarilloSurOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AmarilloSurOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoAzulNorteOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AzulNorteOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoAzulNorteOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AzulNorteOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoAzulOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AzulOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoAzulOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AzulOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoAzulSurOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AzulSurOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoAzulSurOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        AzulSurOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoCentroNorteOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        CentroNorteOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoCentroNorteOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        CentroNorteOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoCentroOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        CentroOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoCentroOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        CentroOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoCentroSurOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        CentroSurOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoCentroSurOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        CentroSurOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoNaranjaNorteOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        NaranjaNorteOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoNaranjaNorteOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        NaranjaNorteOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoNaranjaOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        NaranjaOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoNaranjaOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        NaranjaOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoNaranjaSurOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        NaranjaSurOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoNaranjaSurOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        NaranjaSurOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoRojoNorteOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        RojoNorteOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoRojoNorteOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        RojoNorteOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoRojoOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        RojoOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoRojoOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        RojoOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoRojoSurOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        RojoSurOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoRojoSurOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        RojoSurOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoVerdeNorteOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VerdeNorteOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoVerdeNorteOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VerdeNorteOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoVerdeOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VerdeOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoVerdeOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VerdeOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoVerdeSurOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VerdeSurOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoVerdeSurOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VerdeSurOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoVioletaNorteOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VioletaNorteOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoVioletaNorteOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VioletaNorteOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoVioletaOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VioletaOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoVioletaOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VioletaOriente.setImage(image);
    }

    @FXML
    void agregarSemaforoVioletaSurOccidente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VioletaSurOccidente.setImage(image);
    }

    @FXML
    void agregarSemaforoVioletaSurOriente(MouseEvent event) {
        Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-rojo.png")));
        VioletaSurOriente.setImage(image);
    }


    //Mover Semaforos//
    @FXML
    void moverSemaforoAmarilloNorteOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAmarilloNorteOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAmarilloOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAmarilloOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAmarilloSurOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAmarilloSurOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAzulNorteOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAzulNorteOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAzulOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAzulOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAzulSurOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoAzulSurOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoCentroNorteOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoCentroNorteOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoCentroOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoCentroOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoCentroSurOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoCentroSurOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoNaranjaNorteOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoNaranjaNorteOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoNaranjaOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoNaranjaOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoNaranjaSurOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoNaranjaSurOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoRojoNorteOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoRojoNorteOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoRojoOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoRojoOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoRojoSurOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoRojoSurOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVerdeNorteOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVerdeNorteOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVerdeOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVerdeOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVerdeSurOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVerdeSurOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVioletaNorteOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVioletaNorteOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVioletaOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVioletaOriente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVioletaSurOccidente(MouseEvent event) {

    }

    @FXML
    void moverSemaforoVioletaSurOriente(MouseEvent event) {

    }

    @FXML
    void colorear(MouseEvent event) {
        //  Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo-azul.png")));
        // AmarilloNorteOccidente.setImage(image);

    }

    @FXML
    void descolorear(MouseEvent event) {
        //  Image image = new Image((HelloApplication.class.getResourceAsStream("imagenes/circulo.png")));
        //  AmarilloNorteOccidente.setImage(image);

    }

    @FXML
    void lanzar(ActionEvent event) {
        int dado1 = (int) (1 + Math.random() * 6);
        int dado2 = (int) (1 + Math.random() * 6);

        Image image1 = new Image((HelloApplication.class.getResourceAsStream("imagenes/dados/dado-" + dado1 + ".png")));
        Image image2 = new Image((HelloApplication.class.getResourceAsStream("imagenes/dados/dado-" + dado2 + ".png")));

        this.dado1.setImage(image1);
        this.dado2.setImage(image2);
    }

}
