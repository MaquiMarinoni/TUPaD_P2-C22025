/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tp3;

/**
 *
 * @author marin
 */
public class Estudiante {
    
    // Atributos de la clase
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // Defino setters y getters para acceder a los atributos pues son privados 
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0) this.calificacion = 0;
        else if (calificacion > 10) this.calificacion = 10;
        else this.calificacion = calificacion;
    }

    
    // Metodos requeridos
    
    /** Muestra los datos del estudiante **/
    public void mostrarInfo() {
    System.out.printf("Estudiante: %s %s | Curso: %s | Calificación: %.2f%n",
    nombre, apellido, curso, calificacion);
    }
    
    /** Sube calificacion sin pasar el 10 **/
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > 10) {
        calificacion = 10;
        }
    }
    
    
    /** baja calificacion sin pasar de 0 (calificacion no negativa) **/
    public void bajarCalificacion(double puntos) {
    calificacion -= puntos;
    if (calificacion < 0) {
        calificacion = 0;
    }
}

    void setEdad(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
