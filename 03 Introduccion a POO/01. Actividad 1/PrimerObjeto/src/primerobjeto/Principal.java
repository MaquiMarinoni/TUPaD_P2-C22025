/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author marin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a = new Auto();
        // la linea que sigue imprime los datos por dafault - null, 0 y false
        // System.out.println(a.patente + " " + a.color + " " + a.km + " " + a.conAire);
        // Puedo definir dentro de la class un metodo para que en todas las variables haga lo mismo
        
        // MOSTRAR DATOS SERA UN METODO
        a.mostrarDatos();
        a.patente = "abc123";
        a.color = "negro";
        a.km = 500;
        a.conAire = true;
        a.mostrarDatos();   
    }
    
}
