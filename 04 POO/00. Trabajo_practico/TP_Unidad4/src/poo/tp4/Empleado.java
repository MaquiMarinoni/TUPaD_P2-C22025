/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tp4;

/**
 *
 * @author marin
 */
public class Empleado {
    
    // Atributos privados
    private int id;         // identificador unido del empleado
    private String nombre;  // nombre completo
    private String puesto;  // cargo que desempeña
    private double salario; // salario actual
    
    // Contador global de empleados creados.
    private static int totalEmpleados = 0;
    
    // Constructores sobrecargados

    // Constructor "completo": recibe todos los atributos.
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;               // this distingue atributo de parámetro
        this.nombre = nombre;
        this.puesto = puesto;
        setSalario(salario);        // validación centralizada
        totalEmpleados++;           // actualiza contador global
    }

    // Constructor "reducido": asigna id automático y salario por defecto.
    public Empleado(String nombre, String puesto) {
        // Sobre-carga + this(...): delega en el constructor principal
        this(totalEmpleados + 1, nombre, puesto, 0.0);
    }

    // Métodos sobrecargados actualizarSalario()

    //  Actualiza con % de aumento
    public void actualizarSalario(double porcentaje) {
        double delta = salario * (porcentaje / 100.0);
        this.salario += delta;
    }

    // Actualiza con valor fijo
    public void actualizarSalario(double montoFijo, boolean esMontoFijo) {
        if (!esMontoFijo) return;
        this.salario += montoFijo;
    }

    // Metodo toString() 
    // Mostrar id, nombre, puesto y salario de forma legible.
    @Override
    public String toString() {
        return String.format("Empleado{id=%d, nombre='%s', puesto='%s', salario=%.2f}",
                id, nombre, puesto, salario);
    }

    // Metodo mostrarTotalEmpleados
    // Retornar el total de empleados creados hasta el momento.

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Encapsulamiento en los atributos
    // --- Getters/Setters ---
    
    public int getId() { return id; }
    public void setId(int id) { if (id > 0) this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) this.nombre = nombre.trim();
    }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.trim().isEmpty()) this.puesto = puesto.trim();
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = Math.max(0.0, salario); }

}

