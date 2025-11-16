/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enumsatributosmetodos;

/**
 *
 * @author AGUSTIN
 */
public class Main {

    public static void main(String[] args) {
        Continente[] continentes = Continente.values();
        for (int i = 0; i < continentes.length; i++) {
            System.out.println(continentes[i].densidadPoblacion());
        }
    }
}