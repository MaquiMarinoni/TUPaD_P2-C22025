/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tp3;

/**
 *
 * @author marin
 */
public class NaveEspacial {
    
    // Atributos de la clase
    private String nombre;
    private double combustible; // unidades de combustible

    // Getters/Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        this.nombre = (nombre == null || nombre.trim().isEmpty()) ? "Sin nombre" : nombre.trim();
    }

    public double getCombustible() { return combustible; }
    public void setCombustible(double combustible) {
        if (combustible < 0) combustible = 0;
        this.combustible = combustible;
    }

    // Métodos requeridos
    
    public void mostrarEstado() {
        System.out.printf("Nave %s | Combustible: %.1f%n", nombre, combustible);
    }

    public void despegar() {
        if (combustible > 0) System.out.println("Despegando.");
        else System.out.println("No hay combustible para despegar. ");
    }

    /** Avanza 'distancia' consumiendo 1 combustible por 1 distancia. */
    public void avanzar(double distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser positiva.");
            return;
        }
        double requerido = distancia;
        if (requerido <= combustible) {
            combustible -= requerido;
            System.out.println("Avance completado: " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente: requiere " + requerido +
                               " y hay " + combustible + ". No avanza.");
        }
    }

    /** Suma combustible sin tope. */
    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }
        combustible += cantidad;
        System.out.println("Recarga realizada. Combustible actual: " + combustible);
    }
}