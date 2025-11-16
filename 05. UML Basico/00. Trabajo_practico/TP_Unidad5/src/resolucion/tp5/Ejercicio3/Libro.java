/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio3;

/**
 *
 * @author marinon
 */
public class Libro {
    private String titulo;
    private int anio;
    private Autor autor;         // Asociación unidireccional
    private Editorial editorial; // Agregación

    public Libro(String titulo, int anio, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', anio=" + anio +
               ", autor=" + autor + ", editorial=" + editorial + "}";
    }
}