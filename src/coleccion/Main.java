package coleccion;
import coleccion.elementos.Moneda;
import coleccion.elementos.Sello;
import coleccion.enums.ConservacionSello;
import coleccion.enums.ConservacionMoneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Scanner scanner = new Scanner(System.in);
                int opcion;

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

                    switch (opcion) {
                        case 1:
                            System.out.print("País: ");
                            String pais = scanner.next();
                            System.out.print("Autoridad gobernante: ");
                            String autoridadGobernante = scanner.next();
                            System.out.print("Año: ");
                            int annus = scanner.nextInt();
                            System.out.print("Valor: ");
                            double valor = scanner.nextDouble();
                            System.out.print("Unidad monetaria: ");
                            String unidadMonetaria = scanner.next();
                            System.out.print("Rareza: ");
                            int rareza = scanner.nextInt();
                            System.out.print("Precio: ");
                            double precio = scanner.nextDouble();
                            System.out.print("Composición: ");
                            String composicion = scanner.next();
                            System.out.print("Peso: ");
                            double peso = scanner.nextDouble();
                            System.out.print("Diámetro: ");
                            double diametro = scanner.nextDouble();
                            System.out.print("Grosor: ");
                            double grosor = scanner.nextDouble();
                            System.out.print("Conservación (0-10): ");
                            int conservacionMoneda = scanner.nextInt();

                            coleccion.agregarElemento(new Moneda(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio, composicion, peso, diametro, grosor, ConservacionMoneda.values()[conservacionMoneda]));
                            break;
                        case 2:
                            System.out.print("País: ");
                            pais = scanner.next();
                            System.out.print("Autoridad gobernante: ");
                            autoridadGobernante = scanner.next();
                            System.out.print("Año: ");
                            annus = scanner.nextInt();
                            System.out.print("Valor: ");
                            valor = scanner.nextDouble();
                            System.out.print("Unidad monetaria: ");
                            unidadMonetaria = scanner.next();
                            System.out.print("Rareza: ");
                            rareza = scanner.nextInt();
                            System.out.print("Precio: ");
                            precio = scanner.nextDouble();
                            System.out.print("Altura: ");
                            double altura = scanner.nextDouble();
                            System.out.print("Anchura: ");
                            double anchura = scanner.nextDouble();
                            System.out.print("Imagen: ");
                            double imagen = scanner.nextDouble();
                            System.out.print("Conservación (0-10): ");
                            int conservacionSello = scanner.nextInt();

                            coleccion.agregarElemento(new Sello(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio, altura, anchura, imagen, ConservacionSello.values()[conservacionSello]));
                            break;
                        case 3:
                            coleccion.mostrarMonedas();
                            break;
                        case 4:
                            coleccion.mostrarSellos();
                            break;
                        case 5:
                            System.out.println("Precio total de la colección: " + coleccion.valorTotal());
                            break;
                        case 6:
                            System.out.println("Rareza media de la colección: " + coleccion.rarezaMedia());
                            break;
                        case 0:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                } while (opcion != 0);

                scanner.close();
            }
        }