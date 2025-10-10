/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.preciofinal;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class PrecioFinal {

    /**
     * @param args the command line arguments
     */
    // Función que calcula el precio final
    // impuesto y descuento se reciben como proporción (ej.: 0.10 para 10%)
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Precio final = base + (base * impuesto) - (base * descuento)
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leemos el precio base y los porcentajes
        System.out.print("Ingrese el precio base: ");
        double precioBase = sc.nextDouble();

        System.out.print("Impuesto % (ej: 10): ");
        double impPorc = sc.nextDouble();

        System.out.print("Descuento % (ej: 5): ");
        double descPorc = sc.nextDouble();

        // Convertimos a proporción (dividimos por 100)
        double impuesto = impPorc / 100.0;
        double descuento = descPorc / 100.0;

        // Llamamos a la función y obtenemos el resultado
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostramos el precio final (formateado a 2 decimales)
        System.out.printf("Precio final: %.2f%n", precioFinal);

        sc.close();
    }
}