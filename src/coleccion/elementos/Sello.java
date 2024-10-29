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

    @Override
    public String toString() {
        return "Sello{" +
                "pais='" + pais + '\'' +
                ", autoridadGobernante='" + autoridadGobernante + '\'' +
                ", annus=" + annus +
                ", valor=" + valor +
                ", unidadMonetaria='" + unidadMonetaria + '\'' +
                ", rareza=" + rareza +
                ", precio=" + precio +
                ", altura=" + altura +
                ", anchura=" + anchura +
                ", imagen=" + imagen +
                ", conservacionSello=" + conservacionSello +
                '}';
    }
}
