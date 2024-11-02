package enums;

// Enumeracion de los estados de conservacion del sello
public enum ConservacionSello {
    U,   // Used
    NSG, // Not So Good
    NF,  // Not Fine
    N;    // New

    public static ConservacionSello fromString(String estado) {
        try {
            return ConservacionSello.valueOf(estado.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Estado de conservación inválido: " + estado);
        }
    }
}

