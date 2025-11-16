/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio3;

/**
 *
 * @author marinon
 */
public class Main {

    public static void main(String[] args) {
        Autor autor = new Autor("Julio Cortazar", "Argentina");
        Editorial ed = new Editorial("Alfaguara", "30-12345678-9");
        Libro libro = new Libro("Rayuela", 1963, autor, ed);

        System.out.println("=== Ejercicio 3 ===");
        System.out.println(libro);
    }
}