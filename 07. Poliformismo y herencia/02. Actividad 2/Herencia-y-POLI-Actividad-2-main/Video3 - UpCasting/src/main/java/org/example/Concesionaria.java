package org.example;
import java.util.ArrayList;

public class Concesionaria {

    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {

        this.vehiculos.add(v);

        // Demostracion por SOUT
        System.out.println(v instanceof Auto);

        // Demostracion por IF
        if (v instanceof Auto) {
           System.out.println("Es un auto");
        } 
    }
}
