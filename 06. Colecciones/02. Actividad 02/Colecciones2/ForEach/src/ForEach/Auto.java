
package ForEach;

public class Auto {
    
//Atributos
private String patente;
private String color;


//Constructor
    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }
    
//ToString();
    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + '}';
    }


}
