/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesbasicas;
import java.util.Scanner;
/* @author Marinoni, Macarena */
public class OperacionesBasicas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declaración de variables
        int num1, num2;
        int suma, resta, multiplicacion;
        double division;
        // Solicitar números al usuario
        System.out.print("Ingrese el primer número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        // Operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        if (num2 != 0) {
            division = (double) num1 / num2;
        } else {
            division = Double.NaN; // No es un número (cuando se divide por 0)
        }
        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (num2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("División: No se puede dividir por 0");
        }
    }
}

