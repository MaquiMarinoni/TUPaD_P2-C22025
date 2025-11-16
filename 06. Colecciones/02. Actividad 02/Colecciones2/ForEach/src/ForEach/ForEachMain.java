
package ForEach;

public class ForEachMain {

    public static void main(String[] args) {
  
      Concesionaria c= new Concesionaria  ("Auto Facil");
      
      c.agregarAuto(new Auto("aei 123", "Rojo"));
      c.agregarAuto(new Auto("ouk 143", "Verde"));
      c.agregarAuto(new Auto("nkd 755", "Azul"));
      
      c.mostrarAutos();
      
    }
    
}
