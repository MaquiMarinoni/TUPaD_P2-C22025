/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.determinarmayor;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class DeterminarMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creamos el Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Leemos tres números enteros
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        // Suponemos que el mayor es el primero y comparamos con los demás
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        // Mostramos el resultado
        System.out.println("El mayor es: " + mayor);

        // Cerramos el Scanner
        sc.close();
    }
    
}
