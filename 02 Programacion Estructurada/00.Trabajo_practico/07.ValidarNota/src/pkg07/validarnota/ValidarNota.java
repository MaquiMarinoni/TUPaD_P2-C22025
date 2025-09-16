/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.validarnota;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class ValidarNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creamos el Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        int nota; // guardará la nota válida

        // Repetimos la lectura hasta que el valor esté entre 0 y 10 (inclusive)
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();

            // Si está fuera de rango, avisamos y volvemos a pedir
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Debe estar entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        // Mostramos el resultado cuando la nota es válida
        System.out.println("Nota válida: " + nota);

        // Cerramos el Scanner
        sc.close();
    }
    
}
