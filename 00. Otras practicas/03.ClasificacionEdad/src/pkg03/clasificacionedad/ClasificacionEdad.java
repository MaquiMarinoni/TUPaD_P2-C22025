/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.clasificacionedad;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class ClasificacionEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Leemos la edad (entero)
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        // Determinamos la categoría según rangos simples
        String clasificacion;
        if (edad < 12) {
            clasificacion = "Niño";
        } else if (edad <= 17) {
            clasificacion = "Adolescente";
        } else if (edad <= 59) {
            clasificacion = "Adulto";
        } else {
            clasificacion = "Adulto mayor";
        }

        // Mostramos el resultado
        System.out.println("Eres un " + clasificacion + ".");

        // Cerramos el Scanner
        sc.close();
    }
    
}
