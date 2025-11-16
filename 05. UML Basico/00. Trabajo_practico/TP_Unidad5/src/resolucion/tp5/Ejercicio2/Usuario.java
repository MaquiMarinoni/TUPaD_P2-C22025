/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio2;
/**
 *
 * @author marinon
 */

// Asociación bidireccional con Celular
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // referencia de vuelta

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void setCelular(Celular celular) { this.celular = celular; }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', dni='" + dni + "'}";
       }

}