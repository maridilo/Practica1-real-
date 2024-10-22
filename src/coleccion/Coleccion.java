package coleccion;

import coleccion.elementos.ElementoColeccionable;
import coleccion.elementos.Moneda;
import coleccion.elementos.Sello;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private List<ElementoColeccionable> elementos;

    public Coleccion() {
        this.elementos = new ArrayList<>();
    }

    public void añadirMoneda(Moneda moneda) {
        elementos.add(moneda);
    }

    public void añadirSello(Sello sello) {
        elementos.add(sello);
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
            valor += elemento.getValor();
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
