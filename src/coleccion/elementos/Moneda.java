package coleccion.elementos;

import coleccion.enums.ConservacionMoneda;

public class Moneda extends ElementoColeccionable {
    private String composicion;
    private double peso;
    private double diametro;
    private double grosor;
    private ConservacionMoneda conservacionMoneda;

    public Moneda(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, String composicion, double peso, double diametro, double grosor, ConservacionMoneda conservacionMoneda) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.conservacionMoneda = conservacionMoneda;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    public ConservacionMoneda getConservacionMoneda() {
        return conservacionMoneda;
    }

    public void setConservacionMoneda(ConservacionMoneda conservacionMoneda) {
        this.conservacionMoneda = conservacionMoneda;
    }
}
