/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03_cantidadbilletes;

import java.util.Scanner;

/* @author Marinoni Macarena */
public class Cantidad_Billetes {
/*el usuario ingresa un monto y el codigo indica cual es la combinacion minima de billetes para alcanzarlo */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monto, cant100, cant50, cant20, cant10, cant5, cant2;
        
        System.out.print("Ingrese un monto: ");
        monto = Integer.parseInt( input.nextLine() );
        
        cant100 = monto / 100;
        monto = monto % 100;
        
        cant50 = monto / 50;
        monto = monto % 50;
        
        cant20 = monto / 20;
        monto = monto % 20;
        
        cant10 = monto / 10;
        monto = monto % 10;
        
        cant5 = monto / 5;
        monto = monto % 5;
        
        cant2 = monto / 2;
        monto = monto % 2;
        
        System.out.println("Cantidad de billeres de 100: " + cant100);
        System.out.println("Cantidad de billeres de 50: " + cant50);
        System.out.println("Cantidad de billeres de 20: " + cant20);
        System.out.println("Cantidad de billeres de 10: " + cant10);
        System.out.println("Cantidad de billeres de 5: " + cant5);
        System.out.println("Cantidad de billeres de 2: " + cant2);   
        System.out.println("Cantidad de billeres de 1: " + monto);   
    }
    
}
