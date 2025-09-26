/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tp3;

/**
 *
 * @author marin
 */
public class Libro {
    
    // Atributos de la clase
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // Getters para todos los atributos
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }
    
    // Setter para titulo y autor
    
        public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            this.titulo = "Sin título";
        } else {
            this.titulo = titulo.trim();
        }
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            this.autor = "Desconocido";
        } else {
            this.autor = autor.trim();
        }
    }

    // Setter con validación para añoPublicacion
    public void setAnioPublicacion(int anio) {
        // Validación simple de 1er año: mayor a 0 y no mayor al año actual
        int anioActual = java.time.Year.now().getValue();
        if (anio > 0 && anio <= anioActual) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año inválido: " + anio + ". No se modifica.");
        }
    }
}
