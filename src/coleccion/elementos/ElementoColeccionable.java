package coleccion.elementos;

public abstract class ElementoColeccionable {
    protected String pais;
    protected String autoridadGobernante;
    protected int annus;
    protected double valor;
    protected String unidadMonetaria;
    protected int rareza;
    protected double precio;

    // Constructor
    public ElementoColeccionable(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio) {
        if (pais == null || pais.isEmpty()) {
            throw new IllegalArgumentException("El país no puede ser nulo o vacío");
        }
        if (autoridadGobernante == null || autoridadGobernante.isEmpty()) {
            throw new IllegalArgumentException("La autoridad gobernante no puede ser nula o vacía");
        }
        if (annus <= 0) {
            throw new IllegalArgumentException("El año debe ser un número positivo");
        }
        if (valor < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }
        if (unidadMonetaria == null || unidadMonetaria.isEmpty()) {
            throw new IllegalArgumentException("La unidad monetaria no puede ser nula o vacía");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        this.pais = pais;
        this.autoridadGobernante = autoridadGobernante;
        this.annus = annus;
        this.valor = valor;
        this.unidadMonetaria = unidadMonetaria;
        setRareza(rareza);
        this.precio = precio;
    }

    // Getters y Setters
    public void setRareza(int rareza) {
    if (rareza < 1 || rareza > 100) {
        throw new IllegalArgumentException("La rareza debe ser un número entre 1 y 100");
    }
    this.rareza = rareza;
    }

    public double getRareza() {
        return rareza;
    }

    public abstract String toString();

    public double getPrecio() {
        return precio;
    }
}
