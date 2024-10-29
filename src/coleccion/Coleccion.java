package coleccion;
import coleccion.elementos.ElementoColeccionable;
import coleccion.elementos.Moneda;
import coleccion.elementos.Sello;
import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private ArrayList<ElementoColeccionable> elementos;

    public Coleccion() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoColeccionable elemento) {
        elementos.add(elemento);
    }

    public void mostrarMonedas() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                System.out.println(elemento);
            }
        }
    }

    public void mostrarSellos() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                System.out.println(elemento);
            }
        }
    }

    public double valorTotal() {
        double valor = 0;
        for (ElementoColeccionable elemento : elementos) {
            valor += elemento.getPrecio();
        }
        return valor;
    }

    public double rarezaMedia() {
        double rareza = 0;
        for (ElementoColeccionable elemento : elementos) {
            rareza += elemento.getRareza();
        }
        return rareza / elementos.size();
    }
}
