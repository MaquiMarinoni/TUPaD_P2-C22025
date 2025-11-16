/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio5;

/**
 *
 * @author marinon
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 5: Computadora / PlacaMadre / Propietario ===");

        Propietario p = new Propietario("Sofía Díaz", "40.888.999");
        Computadora Computadora = new Computadora("Lenovo", "ThinkStation",
                "Z790", "LGA1700", p);

        System.out.println(Computadora);
        System.out.println("Desde propietario veo su Computadora: " + p.getPc());
    }

}