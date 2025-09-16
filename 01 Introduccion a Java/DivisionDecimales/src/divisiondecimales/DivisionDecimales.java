/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisiondecimales;

/* @author Marinoni, Macarena */
import java.util.Scanner;

public class DivisionDecimales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaración de variables
        double num1, num2, resultado;

        // Ingreso de datos
        System.out.print("Ingrese el primer número: ");
        num1 = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el segundo número: ");
        num2 = Double.parseDouble(input.nextLine());

        // División con control de división por 0
        if (num2 != 0) {
            resultado = num1 / num2;
            System.out.println("Resultado de la división (double): " + resultado);
        } else {
            System.out.println("Error: no se puede dividir por 0");
        }
    }
}