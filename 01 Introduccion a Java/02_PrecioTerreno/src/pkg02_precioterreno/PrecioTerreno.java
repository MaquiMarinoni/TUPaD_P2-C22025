/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02_precioterreno;

import java.util.Scanner;

/*@author Marinoni, Macarens */
public class PrecioTerreno {
// El usuario debeta cargar ancho, largo y precio de metro cuadrado
// el codigo calcula el precio del terreno y cuanto alambre se necesita para cercarlo por compreto n veces
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ancho, largo, superficie, perimetro, cantAlambre, cantVueltas;
        double precioM2, valorTerreno;
        
        System.out.print("Ingrese el ancho del terreno: ");
        ancho = Integer.parseInt( input.nextLine () );
        
        System.out.print("Ingrese el largo del terreno: ");
        largo = Integer.parseInt( input.nextLine () );
        
        System.out.print("Ingrese cantidad de vueltas deseadas: ");
        cantVueltas = Integer.parseInt( input.nextLine () );
        
        System.out.print("Ingrese el precioM2: ");
        precioM2 = Double.parseDouble( input.nextLine () );
        
        superficie = ancho * largo;
        valorTerreno = superficie*precioM2;
        
        perimetro = 2*ancho + 2*largo;
        cantAlambre = perimetro * cantVueltas;
        
        System.out.println("El valor del terreno es de " + valorTerreno + " USD");
        System.out.println("La cantidad de alambre necesaria sera de " + cantAlambre + " metros");
    }
    
}
