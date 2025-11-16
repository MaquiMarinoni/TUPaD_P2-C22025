/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio7;

/**
 *
 * @author rigon
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 7 — Vehiculo / Motor / Conductor ===");

        Conductor c = new Conductor("Lucía Ramos", "B1-AR-2028");
        Vehiculo v = new Vehiculo("Toyota", "Corolla", "Nafta", 140, c);

        System.out.println(v);
        System.out.println("Desde conductor veo su vehículo: " + c.getVehiculo());
    }

}