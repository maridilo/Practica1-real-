package coleccion;
import coleccion.elementos.ElementoColeccionable;
import coleccion.elementos.Moneda;
import coleccion.elementos.Sello;
import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private ArrayList<ElementoColeccionable> elementos;

    // Constructor
    public Coleccion() {
        this.elementos = new ArrayList<>();
    }

    // Metodo para agregar un elemento a la coleccion
    public void agregarElemento(ElementoColeccionable elemento) {
        elementos.add(elemento);
    }

    // Metodo para agregar una moneda a la coleccion
    public void mostrarMonedas() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                System.out.println(elemento);
            }
        }
    }

    // Metodo para mostrar todos los sellos en la coleccion
    public void mostrarSellos() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                System.out.println(elemento);
            }
        }
    }

    // Metodo para calcular el valor total de la coleccion
    public double valorTotal() {
        double valor = 0;
        for (ElementoColeccionable elemento : elementos) {
            valor += elemento.getPrecio();
        }
        return valor;
    }

    // Metodo para calcular la rareza media de la coleccion
    public double rarezaMedia() {
        double rareza = 0;
        for (ElementoColeccionable elemento : elementos) {
            rareza += elemento.getRareza();
        }
        return rareza / elementos.size();
    }
}
