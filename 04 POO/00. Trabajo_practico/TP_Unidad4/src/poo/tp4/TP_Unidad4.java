/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.tp4;
/**
 *
 * @author marin
 */
public class TP_Unidad4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constructor reducido (salario arranca en 0.0)
        Empleado e1 = new Empleado("Joaquin Gaete", "Analista Tecnico");
        Empleado e2 = new Empleado("Ma. Guadalupe De Angelis", "Analista de Suscripción");

        // Setear salario inicial explícitamente
        e1.setSalario(180_000.0);
        e2.setSalario(200_000.0);

        // Constructor completo
        Empleado e3 = new Empleado(100, "Macarena Marinoni", "Supervisora Tecnica", 250_000.0);

        System.out.println("Estado inicial");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Aumentos
        e2.actualizarSalario(12.5);                 // +12.5% a e2
        e3.actualizarSalario(50_000.0, true);       // +$50.000 a e3

        System.out.println("\nLuego de actualizar salario");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("\nTotal empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
