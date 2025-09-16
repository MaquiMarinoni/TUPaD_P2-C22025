/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concatenacion;

import java.util.Scanner;

/*@author Marinoni Macarena */

public class Concatenacion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String nombre;
        String saludo;
        System.out.println("Ingresa tu nombre:");
        nombre = input.nextLine();
        saludo = "Hola " + nombre;
        System.out.println(saludo); // el metodo println deja un reglon, si uso solo print, imprime en la misma linea
    }
    
}
