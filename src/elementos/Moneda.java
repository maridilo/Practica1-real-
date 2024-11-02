package elementos;
import enums.ConservacionMoneda;

public class Moneda extends ElementoColeccionable {
    private String composicion;
    private double peso;
    private double diametro;
    private double grosor;
    private ConservacionMoneda conservacionMoneda;

    // Constructor
    public Moneda(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, String composicion, double peso, double diametro, double grosor, ConservacionMoneda conservacionMoneda) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.conservacionMoneda = conservacionMoneda;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "pais='" + pais + '\'' +
                ", autoridadGobernante='" + autoridadGobernante + '\'' +
                ", annus=" + annus +
                ", valor=" + valor +
                ", unidadMonetaria='" + unidadMonetaria + '\'' +
                ", rareza=" + rareza +
                ", precio=" + precio +
                ", composicion='" + composicion + '\'' +
                ", peso=" + peso +
                ", diametro=" + diametro +
                ", grosor=" + grosor +
                ", conservacionMoneda=" + conservacionMoneda +
                '}';
    }
}
