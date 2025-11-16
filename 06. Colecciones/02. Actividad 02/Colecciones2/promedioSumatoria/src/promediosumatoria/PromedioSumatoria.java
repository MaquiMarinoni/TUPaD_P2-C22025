
package promediosumatoria;


public class PromedioSumatoria {

    public static void main(String[] args) {
    
        Concesionaria c= new Concesionaria  ("Auto Facil");
      
      c.agregarAuto(new Auto("aei 123", "Rojo", 13000));
      c.agregarAuto(new Auto("ouk 143", "Verde", 77344));
      c.agregarAuto(new Auto("nkd 755", "Azul", 98743));
      
      //muestro autos
      System.out.println("-----------------------AUTOS--------------------------------");
      System.out.println("");
      c.mostrarAutos();
      System.out.println("");
      System.out.println("-----------------------DATOS--------------------------------");
      System.out.println("");
      System.out.println("Kms totales recorridos: " + c.sumatoriaKmsRecorridos());
      System.out.println("Cantidad de autos en la concesionaria: " + c.cantAutos());
      System.out.println("Promedio de kms recorridos en total: " + c.promedioKmsRecorridos());
      System.out.println("");
      System.out.println("------------------------------------------------------------");
      
    }
    
}
