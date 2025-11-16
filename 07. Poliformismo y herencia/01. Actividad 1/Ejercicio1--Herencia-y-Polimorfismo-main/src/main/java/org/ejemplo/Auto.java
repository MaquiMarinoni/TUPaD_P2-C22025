package org.ejemplo;

// Clase Auto que hereda de Vehiculo
// Se aplica HERENCIA: Auto extiende a Vehiculo, y hereda sus métodos públicos
public class Auto extends Vehiculo {
    private boolean tieneAire;

    // Método específico de Auto, no existe en Vehiculo
    void prenderAire() {
        if (tieneAire) {
            System.out.println("Prendiendo aire...");
        } else {
            System.out.println("El auto no tiene aire acondicionado.");
        }
    }

    public boolean isTieneAire() {
        return tieneAire;
    }

    public void setTieneAire(boolean tieneAire) {
        this.tieneAire = tieneAire;
    }
}
