package org.example;

public class Moto extends Vehiculo {

    private int anchoDeManubrio;
    
    //Implementación del constructor de 'Moto'
    // El constructor de 'Moto' debe recibir el ancho de manubrio, la marca, el modelo y la patente.
    public Moto(int anchoDeManubrio, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
    }

    public void hacerWheelie() {
        System.out.println(anchoDeManubrio);
        System.out.println("Haciendo la wheelie...");
    }   
}
