package org.example;

public class Principal {

    public static void main(String[] args) {

        //Creando un objeto de tipo Auto
        Auto a = new Auto(true, "MarcaFalsa", "XYZ", "ABC123");
        a.acelerar();
        System.out.println(a);

        //Sirve para demostrar que object se puede generar vacio
        new Object();
    }

}