package org.ejemplo;

// Clase base que representa un Vehículo
// Aquí se aplica ENCAPSULAMIENTO usando atributos privados y métodos públicos (getters y setters)
public class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;

    // Método público accesible por cualquier subclase o desde fuera de la clase
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frenar() {
        System.out.println("Frenando...");
    }

    // Método privado: No puede ser heredado ni accedido desde fuera de esta clase
    private void chequearMotor() {
        System.out.println("Chequeando motor...");
    }

    // Este método público sí puede ser heredado
    // Internamente usa el método privado 'chequearMotor'
    public void encender() {
        chequearMotor();
        System.out.println("Encendiendo...");
    }

    // GETTERS y SETTERS: Acceso controlado a atributos privados
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}