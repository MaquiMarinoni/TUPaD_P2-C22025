/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.bisiesto;
import java.util.Scanner;

/**
 *
 * @author marin
 */
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);
        
        // Pedimos el año al usuario
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        // Variable booleana para guardar si es bisiesto o no
        boolean esBisiesto;
        
        // Reglas de año bisiesto (en este orden):
        // 1) Si es divisible por 400 -> bisiesto
        // 2) Si no, si es divisible por 100 -> NO bisiesto
        // 3) Si no, si es divisible por 4 -> bisiesto
        // 4) En cualquier otro caso -> NO bisiesto
        if (anio %400 == 0) {
            esBisiesto = true;
        } else if (anio %100 == 0) {
            esBisiesto = true; 
        } else esBisiesto = anio % 4 == 0;
        
        // Mostramos el resultado por pantalla
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        sc.close();
    }
}
