/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05.sumapares;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class SumaPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Acumulador para la suma de pares
        int sumaPares = 0;

        // Leemos números hasta que el usuario ingrese 0
        // Solo sumamos los que sean pares (n % 2 == 0)
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            int n = sc.nextInt();

            if (n == 0) {
                // 0 es la señal para cortar el ciclo (no se suma)
                break;
            }

            // Si es par, lo agregamos a la suma
            if (n % 2 == 0) {
                sumaPares += n;
            }
        }

        // Mostramos el resultado
        System.out.println("La suma de los números pares es: " + sumaPares);

        // Cerramos el Scanner
        sc.close();
    }
    
}
