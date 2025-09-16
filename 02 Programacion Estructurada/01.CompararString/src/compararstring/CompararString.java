/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compararstring;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class CompararString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombreDePersona = input.nextLine();
        
        String nombreEsperado = "Juan";
        
        System.out.println(nombreDePersona.equalsIgnoreCase(nombreEsperado));
    }
    
}
