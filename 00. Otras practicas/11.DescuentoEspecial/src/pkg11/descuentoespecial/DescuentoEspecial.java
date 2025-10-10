/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.descuentoespecial;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class DescuentoEspecial {

    /**
     * @param args the command line arguments
     */
    // Constante "global": define el % de descuento fijo del sistema.
    // Se declara a nivel de clase para evitar “números mágicos” y poder cambiarlo en un solo lugar.
    private static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        // Creamos el Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Leemos el precio del producto (double)
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        // Calculamos el monto descontado y el precio final
        double montoDescuento = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - montoDescuento;

        // Mostramos resultados (con 2 decimales)
        System.out.printf("Descuento aplicado (%.0f%%): %.2f%n", DESCUENTO_ESPECIAL * 100, montoDescuento);
        System.out.printf("Precio final: %.2f%n", precioFinal);

        // Cerramos el Scanner
        sc.close();
    }
}