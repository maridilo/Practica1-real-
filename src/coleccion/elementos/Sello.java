package coleccion.elementos;

import coleccion.enums.ConservacionSello;

public class Sello extends ElementoColeccionable {
    private double altura;
    private double anchura;
    private double imagen;
    private ConservacionSello conservacionSello;

    public Sello(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, double altura, double anchura, double imagen, ConservacionSello conservacionSello) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.altura = altura;
        this.anchura = anchura;
        this.imagen = imagen;
        this.conservacionSello = conservacionSello;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getImagen() {
        return imagen;
    }

    public void setImagen(double imagen) {
        this.imagen = imagen;
    }

    public ConservacionSello getConservacionSello() {
        return conservacionSello;
    }

    public void setConservacionSello(ConservacionSello conservacionSello) {
        this.conservacionSello = conservacionSello;
    }
}
