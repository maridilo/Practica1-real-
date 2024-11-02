package enums;

// Enumeracion de los estados de conservacion de la moneda
public enum ConservacionMoneda {
    G,   // Good
    VG,  // Very Good
    F,   // Fine
    VF,  // Very Fine
    XF,  // Extra Fine
    AU,  // Almost Uncirculated
    UNC;  // Uncirculated

    public static ConservacionMoneda fromString(String estado) {
        try {
            return ConservacionMoneda.valueOf(estado.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Estado de conservación inválido: " + estado);
        }
    }
}



