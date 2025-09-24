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
        System.out.println(a.patente + " " + a.color + " " + a.km + " " + a.conAire);
        a.patente = "abc123";
        a.color = "negro";
        a.km = 500;
        a.conAire = true;
        System.out.println(a.patente + " " + a.color + " " + a.km + " " + a.conAire);
        
        Auto a2 = new Auto();
        System.out.println(a2.patente + " " + a2.color + " " + a2.km + " " + a2.conAire);
        a2.patente = "def456";
        a2.color = "blanco";
        a2.km = 600;
        a2.conAire = false;
        System.out.println(a2.patente + " " + a2.color + " " + a2.km + " " + a2.conAire);
    }
    
}
