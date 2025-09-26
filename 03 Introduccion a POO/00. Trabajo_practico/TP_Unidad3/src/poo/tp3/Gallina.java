/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tp3;

/**
 *
 * @author marin
 */
public class Gallina {
    
    // Atributos de la clase 
    private int idGallina;      
    private int edad;            
    private int huevosPuestos;   
    
    // METODOS
    
    /** Incrementa en 1 la cantidad de huevos puestos. */
    public void ponerHuevo() {
        huevosPuestos += 1;
    }

    /** Incrementa en 1 la edad */
    public void envejecer() {
        edad += 1;
    }

    /** Muestra el estado actual de la gallina. */
    public void mostrarEstado() {
        System.out.printf(
            "Gallina #%d | Edad: %d | Huevos: %d%n",
            idGallina, edad, huevosPuestos
        );
    }

    // Getters Y Setters
    public int getIdGallina() { return idGallina; }
    public void setIdGallina(int idGallina) {
        if (idGallina <= 0) {
            System.out.println("idGallina inválido. Debe ser > 0. No se modifica.");
            return;
        }
        this.idGallina = idGallina;
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad < 0) edad = 0;  // evita negativos
        this.edad = edad;
    }

    public int getHuevosPuestos() { return huevosPuestos; }
    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos < 0) huevosPuestos = 0; // evita negativos
        this.huevosPuestos = huevosPuestos;
    }
}
