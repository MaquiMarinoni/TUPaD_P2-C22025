/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradas;

import java.util.Scanner;

/*@author Marinoni Macarena */

public class Entradas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        System.out.println ("Ingresa tu nombre:");
        nombre = input.nextLine(); // Metodo para leer una cada de texto
        System.out.println (nombre);
    }
    
}
