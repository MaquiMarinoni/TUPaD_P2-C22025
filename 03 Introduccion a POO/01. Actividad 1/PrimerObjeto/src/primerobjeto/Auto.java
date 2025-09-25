/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author marin
 */
public class Auto {
    
    String patente;
    String color;
    // desde aca puede deifnir valores por default por ejemplio
    //    String color = "negro";
    // si lo pongo asi por defecto todos los objetos van a tomar el valor "negro" en el atributo color al nacer
    int km;
    boolean conAire;
    
    // DEFINO UN METODO
    // en particular, como este solo va  aimprimir por consola, delante del nombre del metodo ira
    // 'void' que es un tipo de dato vacio
    void mostrarDatos () {
        System.out.println(patente + " " + color + " " + km + " " + conAire);
    }
    
    // Una de las principale caracteristicas de los metodos es que son reutilizables
    // es decir, buscan ordenar el codigo para que sea mas claro y legible

}
