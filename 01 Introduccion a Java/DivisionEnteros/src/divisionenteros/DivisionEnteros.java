/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisionenteros;

import java.util.Scanner;

/* @author Marinoni, Macarena */
public class DivisionEnteros {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaración de variables
        int num1, num2, resultado;

        // Ingreso de datos
        System.out.print("Ingrese el primer número entero: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el segundo número entero: ");
        num2 = Integer.parseInt(input.nextLine());

        // División con control de división por 0
        if (num2 != 0) {
            resultado = num1 / num2;
            System.out.println("Resultado de la división (int): " + resultado);
        } else {
            System.out.println("Error: no se puede dividir por 0");
        }
    }
}

