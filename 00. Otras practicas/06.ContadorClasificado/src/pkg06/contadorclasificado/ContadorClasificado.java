/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06.contadorclasificado;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class ContadorClasificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creamos el Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Contadores para cada tipo
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Leemos exactamente 10 números enteros
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int n = sc.nextInt();

            // Clasificamos el número y actualizamos el contador correspondiente
            if (n > 0) {
                positivos++;
            } else if (n < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostramos los resultados
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        // Cerramos el Scanner
        sc.close();
    }
    
}
