import elementos.ElementoColeccionable;

import java.util.ArrayList;

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

    // Metodo para mostrar todas las monedas en la coleccion
    public void mostrarMonedas() {
        try {
            if (elementos.isEmpty()) {
                System.out.println("No hay monedas en la colección.");
            } else {
                for (ElementoColeccionable elemento : elementos) {
                    System.out.println(elemento);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar las monedas: " + e.getMessage());
        }
    }

    // Metodo para mostrar todos los sellos en la coleccion
    public void mostrarSellos() {
    try {
        if (elementos.isEmpty()) {
            System.out.println("No hay sellos en la colección.");
        } else {
            for (ElementoColeccionable elemento : elementos) {
                System.out.println(elemento);
            }
        }
    } catch (Exception e) {
        System.out.println("Error al mostrar los sellos: " + e.getMessage());
    }
}

    // Metodo para calcular el valor total de la coleccion
    public double valorTotal() {
        try {
            double total = 0;
            for (ElementoColeccionable elemento : elementos) {
                total += elemento.getPrecio();
            }
            return total;
        } catch (Exception e) {
            System.out.println("Error al calcular el valor total: " + e.getMessage());
            return 0;
        }
    }

    // Metodo para calcular la rareza media de la coleccion
    public double rarezaMedia() {
        try {
            if (elementos.isEmpty()) {
                return 0;
            }
            double totalRareza = 0;
            for (ElementoColeccionable elemento : elementos) {
                totalRareza += elemento.getRareza();
            }
            return totalRareza / elementos.size();
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
            return 0;
        } catch (Exception e) {
            System.out.println("Error al calcular la rareza media: " + e.getMessage());
            return 0;
        }
    }
}
