/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.enviototal;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class EnvioTotal {

    /**
     * @param args the command line arguments
     */
    // Función simple para calcular el costo de envío según zona y peso
    static double calcularCostoEnvio(double pesoKg, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return 5.0 * pesoKg;         // tarifa base por kg para envíos nacionales
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return 10.0 * pesoKg;        // tarifa base por kg para envíos internacionales
        } else {
            return -1.0;                 // señal de zona inválida
        }
    }

    // Función simple para sumar producto + envío
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leemos precio del producto y peso del paquete
        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Peso del paquete (kg): ");
        double peso = sc.nextDouble();

        // Leemos la zona como texto (Nacional/Internacional)
        System.out.print("Zona (Nacional/Internacional): ");
        String zona = sc.next(); // una palabra alcanza

        // Calculamos el costo de envío
        double envio = calcularCostoEnvio(peso, zona);
        if (envio < 0) {
            System.out.println("Zona inválida. Debe ser 'Nacional' o 'Internacional'.");
            sc.close();
            return;
        }

        // Calculamos el total a pagar
        double total = calcularTotalCompra(precio, envio);

        // Mostramos resultados (con dos decimales)
        System.out.printf("Costo de envío: %.2f%n", envio);
        System.out.printf("Total a pagar: %.2f%n", total);

        sc.close();
    }
}