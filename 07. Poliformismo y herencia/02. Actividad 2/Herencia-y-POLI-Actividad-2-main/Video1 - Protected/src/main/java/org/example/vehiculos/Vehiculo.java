package org.example.vehiculos;

public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected String patente;

    public void acelerar() {
        System.out.println(marca);
        System.out.println("Acelerando...");
    }

    public void frenar() {
        System.out.println("Frenando...");
    }

    //Este método no es visible desde fuera de la clase ya que es protected
    protected void chequearMotor() {
        System.out.println("Chequeando motor...");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String nuevaMarca) {
        if (nuevaMarca != null) {
            this.marca = nuevaMarca;
        }
    }

    public void encender() {
        chequearMotor();
        System.out.println("Encendiendo...");
    }
}
