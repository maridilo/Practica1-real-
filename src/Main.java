import elementos.Moneda;
import elementos.Sello;
import enums.ConservacionSello;
import enums.ConservacionMoneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Scanner scanner = new Scanner(System.in);
                int opcion;

                // Menú
                do {
                    System.out.println("Menú:");
                    System.out.println("1-Añadir una nueva moneda");
                    System.out.println("2-Añadir un nuevo sello");
                    System.out.println("3-Mostrar todas las monedas");
                    System.out.println("4-Mostrar todos los sellos");
                    System.out.println("5-Mostrar el precio total de la colección");
                    System.out.println("6-Mostrar la rareza media de la colección");
                    System.out.println("0-Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion = scanner.nextInt();

                    // Opciones
                    switch (opcion) {
                        case 1:
                            // Añadir una nueva moneda
                            anadirMoneda(coleccion, scanner);
                            break;
                        case 2:
                            // Añadir un nuevo sello
                            anadirSello(coleccion, scanner);
                            break;
                        case 3:
                            // Mostrar todas las monedas
                            coleccion.mostrarMonedas();
                            break;
                        case 4:
                            // Mostrar todos los sellos
                            coleccion.mostrarSellos();
                            break;
                        case 5:
                            // Mostrar el precio total de la colección
                            System.out.println("Precio total de la colección: " + coleccion.valorTotal());
                            break;
                        case 6:
                            // Mostrar la rareza media de la colección
                            System.out.println("Rareza media de la colección: " + coleccion.rarezaMedia());
                            break;
                        case 0:
                            // Salir
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    // Salto de línea
                } while (opcion != 0);

                scanner.close();
            }

            // Mostrar el menú principal
    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1-Añadir una nueva moneda");
        System.out.println("2-Añadir un nuevo sello");
        System.out.println("3-Mostrar todas las monedas");
        System.out.println("4-Mostrar todos los sellos");
        System.out.println("5-Mostrar el precio total de la colección");
        System.out.println("6-Mostrar la rareza media de la colección");
        System.out.println("0-Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Añadir una nueva moneda a la collecion
    private static void anadirMoneda(Coleccion coleccion, Scanner scanner) {
        try {
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("País: ");
            String pais = scanner.nextLine();
            System.out.print("Autoridad Gobernante: ");
            String autoridadGobernante = scanner.nextLine();
            System.out.print("Año: ");
            int annus = Integer.parseInt(scanner.nextLine());
            System.out.print("Valor: ");
            double valor = Double.parseDouble(scanner.nextLine());
            System.out.print("Unidad Monetaria: ");
            String unidadMonetaria = scanner.nextLine();
            System.out.print("Rareza (1-100): ");
            int rareza = Integer.parseInt(scanner.nextLine());
            System.out.print("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());
            System.out.print("Composición: ");
            String composicion = scanner.nextLine();
            System.out.print("Peso: ");
            double peso = Double.parseDouble(scanner.nextLine());
            System.out.print("Diámetro: ");
            double diametro = Double.parseDouble(scanner.nextLine());
            System.out.print("Grosor: ");
            double grosor = Double.parseDouble(scanner.nextLine());
            System.out.print("Estado de Conservación (G, VG, F, VF, XF, AU, UNC): ");
            ConservacionMoneda estadoConservacion = ConservacionMoneda.fromString(scanner.nextLine());

            // Crear una nueva moneda y añadirla a la colección
            Moneda nuevaMoneda = new Moneda(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio, composicion, peso, diametro, grosor, estadoConservacion);
            coleccion.agregarElemento(nuevaMoneda);
            System.out.println("Moneda añadida con éxito.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada numérica inválida. Por favor, inténtelo de nuevo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    // Añadir un nuevo sello a la colección
    private static void anadirSello(Coleccion coleccion, Scanner scanner) {
        try {
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("País: ");
            String pais = scanner.nextLine();
            System.out.print("Autoridad Gobernante: ");
            String autoridadGobernante = scanner.nextLine();
            System.out.print("Año: ");
            int annus = Integer.parseInt(scanner.nextLine());
            System.out.print("Valor: ");
            double valor = Double.parseDouble(scanner.nextLine());
            System.out.print("Unidad Monetaria: ");
            String unidadMonetaria = scanner.nextLine();
            System.out.print("Rareza (1-100): ");
            int rareza = Integer.parseInt(scanner.nextLine());
            System.out.print("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());
            System.out.print("Ancho: ");
            double ancho = Double.parseDouble(scanner.nextLine());
            System.out.print("Alto: ");
            double alto = Double.parseDouble(scanner.nextLine());
            System.out.print("Imagen: ");
            double imagen = Double.parseDouble(scanner.nextLine());
            System.out.print("Estado de Conservación (U, NSG, NF, N): ");
            ConservacionSello estadoConservacion = ConservacionSello.fromString(scanner.nextLine());

            // Crear un nuevo sello y añadirlo a la colección
            Sello nuevoSello = new Sello(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio, ancho, alto, imagen, estadoConservacion);
            coleccion.agregarElemento(nuevoSello);
            System.out.println("Sello añadido con éxito.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada numérica inválida. Por favor, inténtelo de nuevo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}