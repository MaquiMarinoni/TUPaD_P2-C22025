package org.example.vehiculos;

public class Moto extends Vehiculo {
    private int anchoDeManubrio;

    public void hacerWheelie() {
        System.out.println(marca);
        marca = null;
        System.out.println("Haciendo la wheelie...");
    }
}