package org.ejemplo;

// Clase Moto que hereda de Vehiculo
// También aplica HERENCIA, y agrega comportamiento propio (hacerWheliee)
public class Moto extends Vehiculo {
    private int anchoDeManubrio;

    void hacerWheliee() {
        System.out.println("Haciendo la wheliee...");
    }

    public int getAnchoDeManubrio() {
        return anchoDeManubrio;
    }

    public void setAnchoDeManubrio(int anchoDeManubrio) {
        this.anchoDeManubrio = anchoDeManubrio;
    }
}