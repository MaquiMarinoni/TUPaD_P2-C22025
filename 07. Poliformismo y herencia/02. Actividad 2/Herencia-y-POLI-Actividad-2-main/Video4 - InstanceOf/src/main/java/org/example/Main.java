package org.example;

public class Main {
    public static void main(String[] args) {
        
        Concesionaria c = new Concesionaria();
        Auto a = new Auto(true,"Corolla","XYZ","ABC123");

        c.agregarVehiculo(a);
        c.agregarVehiculo(new Moto(20,"Yamaha","XYZ","ABC123"));

    }
}