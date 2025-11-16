/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio7;

/**
 *
 * @author marinon
 */
// Parte esencial del Vehiculo (COMPOSICIÓN)
public class Motor {
    private final String tipo;    // p.ej. "Nafta", "Diésel", "Eléctrico"
    private final int potenciaHP; // caballos de fuerza

    public Motor(String tipo, int potenciaHP) {
        this.tipo = tipo;
        this.potenciaHP = potenciaHP;
    }

    @Override
    public String toString() {
        return "Motor{tipo='" + tipo + "', potenciaHP=" + potenciaHP + "}";
    }

}