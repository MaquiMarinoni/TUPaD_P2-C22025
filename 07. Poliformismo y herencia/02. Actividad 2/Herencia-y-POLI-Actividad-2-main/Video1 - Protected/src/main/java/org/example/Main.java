package org.example;

import org.example.vehiculos.Vehiculo;


public class Main {

    public static void main(String[] args) {

        Vehiculo v = new Vehiculo();
        
        //No funciona debido a que la propiedad marca es protected
        System.out.println(v.marca);

        

    }

}