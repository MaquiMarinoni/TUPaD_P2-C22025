/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio6;
import java.time.LocalDateTime;

/**
 *
 * @author marinon
 */
public class Reserva {
    private final LocalDateTime fechaHora;
    private final int cantidadPersonas;
    private final Mesa mesa;      // agregación
    private final Cliente cliente; // asociación

    public Reserva(LocalDateTime fechaHora, int cantidadPersonas, Mesa mesa, Cliente cliente) {
        this.fechaHora = fechaHora;
        this.cantidadPersonas = cantidadPersonas;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{fechaHora=" + fechaHora +
               ", cantidadPersonas=" + cantidadPersonas +
               ", mesa=" + mesa + ", cliente=" + cliente + "}";
    }

}
