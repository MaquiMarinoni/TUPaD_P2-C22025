/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio5;

/**
 *
 * @author marinon
 */
// Parte esencial de la Computadora (COMPOSICIÓN 1:1)
public class PlacaMadre {
    private final String chipset; // ej: B550, Z790
    private final String socket;  // ej: AM4, LGA1700

    public PlacaMadre(String chipset, String socket) {
        this.chipset = chipset;
        this.socket = socket;
    }

    @Override
    public String toString() {
        return "PlacaMadre{chipset='" + chipset + "', socket='" + socket + "'}";
    }

}