/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tp3;

/**
 *
 * @author marin
 */
public class Mascota {
    
    // Atributos de la clase
    private String nombre;
    private String especie;
    private int edad;
    
    // --- Getters & Setters ---
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public int getEdad() { return edad; }
    /** Valida que la edad no sea negativa. */
    public void setEdad(int edad) {
        if (edad < 0) edad = 0;
        this.edad = edad;
    }
    
    // Metodos requeridos
    
    /** Muestra los datos de la mascota **/
    public void mostrarInfo() {
    System.out.printf("Mascota: %s | Especie: %s | Edad: %d%n",
    nombre, especie, edad);
    }
    
    /** Cumplir años **/
    public void cumplirAnios() {
    edad += 1;
    }
    
}
