/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.actualizarstock;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class ActualizarStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Creamos el Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Leemos los datos necesarios
        System.out.print("Stock actual: ");
        int stockActual = sc.nextInt();

        System.out.print("Cantidad vendida: ");
        int cantidadVendida = sc.nextInt();

        System.out.print("Cantidad recibida (reposición): ");
        int cantidadRecibida = sc.nextInt();

        // Fórmula: nuevo stock = stock actual - vendida + recibida
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;

        // Mostramos el resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        // Cerramos el Scanner
        sc.close();
    }
}