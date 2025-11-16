
package maximosminimos;


public class MaximosMinimos {

    
    public static void main(String[] args) {
        
        Concesionaria c= new Concesionaria  ("Auto Facil");
      
      c.agregarAuto(new Auto("aei 123", "Rojo", 13000));
      c.agregarAuto(new Auto("ouk 143", "Verde", 77344));
      c.agregarAuto(new Auto("nkd 755", "Azul", 98743));
      
      
      System.out.println("Autos con mayor kms recorridos: " + c.autosMasKmsRecorridos());
      System.out.println("Autos con menor kms recorridos: " + c.autoMenosKmsRecorridos());
    }
    
}
