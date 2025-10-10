/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_edadusuario;

import java.util.Scanner;

/* @author Marinoni Macarena */
public class EjercicioIntegrador01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int anioDeNacimiento, anioActual, edadDelUsuario; // puede declarar mas de una variable en la misma linea
        
        System.out.print("Ingrese su año de nacimiento: ");
        anioDeNacimiento = Integer.parseInt(input.nextLine());
        anioActual = 2025;
        edadDelUsuario =  anioActual - anioDeNacimiento; 
        
        System.out.println("Su edad es " + edadDelUsuario + " o " + (edadDelUsuario-1) + "años");
        anioDeNacimiento = Integer.parseInt(input.nextLine());
    }
    
}
