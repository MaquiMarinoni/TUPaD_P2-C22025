/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio9;

import java.time.LocalDateTime;

/**
 *
 * @author marinon
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 9 — Cita / Paciente / Profesional ===");

        Paciente p = new Paciente("Andrea Ruiz", "40.222.333");
        Profesional dr = new Profesional("Dr. Gómez", "MP 12345");
        Cita c = new Cita(LocalDateTime.of(2025, 11, 5, 10, 0), p, dr, "Chequeo anual");

        System.out.println(c);
    }

}
