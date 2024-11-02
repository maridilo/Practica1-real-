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
