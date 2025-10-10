/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.calculadoradescuentos;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class CalculadoraDescuentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Creamos el Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Leemos el precio (double) y la categoría (A/B/C)
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la categoría (A, B o C): ");
        String textoCat = sc.next(); // leemos una palabra (primer caracter alcanza)
        char categoria = Character.toUpperCase(textoCat.charAt(0));

        // Definimos el porcentaje de descuento según la categoría
        double porcentaje; // en proporción: 0.10 = 10%
        if (categoria == 'A') {
            porcentaje = 0.10;
        } else if (categoria == 'B') {
            porcentaje = 0.15;
        } else if (categoria == 'C') {
            porcentaje = 0.20;
        } else {
            // Si la categoría no es válida, informamos y terminamos
            System.out.println("Categoría inválida. Debe ser A, B o C.");
            sc.close();
            return;
        }

        // Calculamos descuento y precio final
        double descuento = precio * porcentaje;
        double precioFinal = precio - descuento;
        
        // redondeo a 2 decimales (valor)
        precioFinal = Math.round(precioFinal * 100.0) / 100.0;

        // Mostramos resultados
        System.out.println("Descuento aplicado: " + (int)(porcentaje * 100) + "%");
        System.out.println("Monto de descuento: " + descuento);
        System.out.println("Precio final: " + precioFinal);

        // Cerramos el Scanner
        sc.close();
    }
    
}
