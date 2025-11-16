package org.ejemplo;


public class Principal {
    public static void main(String[] args) {

        // 🔹 EJEMPLO 1: Encapsulamiento
        System.out.println("🔹 Encapsulamiento:");
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Toyota");
        vehiculo.setModelo("Corolla");
        vehiculo.setPatente("ABC123");

        // Los atributos son privados, por eso accedemos mediante getters
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Patente: " + vehiculo.getPatente());

        // No podemos hacer algo como: vehiculo.marca = "Ford"; porque es private

        // 🔹 EJEMPLO 2: Herencia - Métodos heredados
        System.out.println("\n🔹 Herencia con Auto:");
        Auto auto = new Auto();
        auto.setMarca("Peugeot");
        auto.setModelo("208");
        auto.setTieneAire(true);  // atributo específico de Auto

        auto.encender();   // Método heredado de Vehiculo
        auto.acelerar();   // Método heredado
        auto.prenderAire(); // Método propio de Auto

        // 🔹 EJEMPLO 3: Herencia con Moto
        System.out.println("\n🔹 Herencia con Moto:");
        Moto moto = new Moto();
        moto.setMarca("Yamaha");
        moto.setModelo("FZ");
        moto.setAnchoDeManubrio(60);

        moto.encender();     // Método heredado
        moto.hacerWheliee(); // Método propio

        System.out.println("Ancho de manubrio: " + moto.getAnchoDeManubrio());

        // 🔹 EJEMPLO 4: Polimorfismo (comportamiento común con diferentes objetos)
        System.out.println("\n🔹 Polimorfismo:");
        Vehiculo vehiculoAuto = new Auto(); // Tipo declarado: Vehiculo. Tipo real: Auto
        Vehiculo vehiculoMoto = new Moto(); // Tipo declarado: Vehiculo. Tipo real: Moto

        vehiculoAuto.acelerar(); // Llama al método de Vehiculo, pero podría sobrescribirse
        vehiculoMoto.frenar();   // Igual

        // No podemos llamar a prenderAire() o hacerWheliee() desde vehiculoAuto/vehiculoMoto
        // porque esas funciones no existen en la clase Vehiculo

        // 🔹 EJEMPLO 5: Método privado NO se hereda
        System.out.println("\n🔹 Métodos privados no se heredan:");
        auto.encender(); // Esto sí funciona porque encender() es público y llama internamente al método privado
        // Pero no se puede hacer auto.chequearMotor(); porque chequearMotor() es privado en Vehiculo
    }
}