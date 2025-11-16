
package maximosminimos;

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
   
public ArrayList <Auto> autosMasKmsRecorridos(){
ArrayList<Auto> listaDeMaximos= new ArrayList<>();

int kmsMax=-1;

for (Auto auto: autos){
    if(auto.getKmsRecorridos()==kmsMax){
        listaDeMaximos.add(auto);
    }else if (auto.getKmsRecorridos()>kmsMax){
        kmsMax=auto.getKmsRecorridos();
        listaDeMaximos.clear();
        listaDeMaximos.add(auto);
    }
}
return listaDeMaximos;

}
    

 public Auto autoMenosKmsRecorridos(){
   Auto autoMin = null;
   int kmsMin=Integer.MAX_VALUE;
   for ( Auto auto : autos){
   if (auto.getKmsRecorridos()<kmsMin){
       kmsMin=auto.getKmsRecorridos();
       autoMin=auto;
   }
   
   }
   return autoMin;
 }
}
