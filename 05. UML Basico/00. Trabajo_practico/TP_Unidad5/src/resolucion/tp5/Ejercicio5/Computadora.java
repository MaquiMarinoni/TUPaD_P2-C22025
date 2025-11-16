/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio5;

/**
 *
 * @author marinon
 */
// COMPOSICIÓN con PlacaMadre + ASOCIACIÓN con Propietario
public class Computadora {
    private final String marca;
    private final String modelo;
    private final PlacaMadre placa; // composición (la Computadora la crea)
    private final Propietario propietario; // asociación

    public Computadora(String marca, String modelo,
              String chipsetPlaca, String socketPlaca,
              Propietario propietario) {

        this.marca = marca;
        this.modelo = modelo;
        this.placa = new PlacaMadre(chipsetPlaca, socketPlaca); // composición: se crea aquí
        this.propietario = propietario;

        if (propietario != null) propietario.setPc(this); // cerramos lazo bidireccional
    }

    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', modelo='" + modelo +
               "', placa=" + placa + ", propietario=" + propietario + "}";
    }

    Propietario getPropietario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setPropietario(Propietario aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}