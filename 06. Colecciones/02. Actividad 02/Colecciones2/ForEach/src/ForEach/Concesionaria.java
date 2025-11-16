
package ForEach;

import java.util.ArrayList;


public class Concesionaria {
 // Atributos
    
    private String nombre;
    private ArrayList<Auto> autos;

//Constructor
    
    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }
    
   public void agregarAuto(Auto a){
   this.autos.add(a);
   } 
    
    
//metodos
    public void mostrarAutos() {
    if (autos.isEmpty()) {
        System.out.println("No hay autos");
    } else {
        // Mostrando con for-each
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
}

}
