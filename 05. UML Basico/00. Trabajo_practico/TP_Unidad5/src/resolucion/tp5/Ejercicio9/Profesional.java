/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio9;

/**
 *
 * @author marinon
 */
public class Profesional {
    private String nombre;
    private String matricula;

    public Profesional(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Profesional{nombre='" + nombre + "', matricula='" + matricula + "'}";
    }

}