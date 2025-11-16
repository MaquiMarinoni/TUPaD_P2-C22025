/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio10;

/**
 *
 * @author marinon
 */
// COMPOSICIÓN con Clave + ASOCIACIÓN con Titular
public class Cuenta {
    private final String cbu;
    private final Titular titular; // asociación
    private final Clave clave;     // composición (se crea aquí)

    public Cuenta(String cbu, Titular titular, String hashClave, String algoritmo) {
        this.cbu = cbu;
        this.titular = titular;
        this.clave = new Clave(hashClave, algoritmo); // composición
    }

    @Override
    public String toString() {
        return "Cuenta{cbu='" + cbu + "', titular=" + titular + ", clave=" + clave + "}";
    }   

}