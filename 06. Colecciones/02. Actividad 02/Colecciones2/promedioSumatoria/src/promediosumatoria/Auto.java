
package promediosumatoria;

public class Auto {
    
//Atributos
private String patente;
private String color;
private int KmsRecorridos;


//Constructor
    public Auto(String patente, String color, int KmsRecorridos) {
        this.patente = patente;
        this.color = color;
        this.KmsRecorridos = KmsRecorridos;
    }

//ToString();

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + ", KmsRecorridos=" + KmsRecorridos + '}';
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKmsRecorridos() {
        return KmsRecorridos;
    }

    public void setKmsRecorridos(int KmsRecorridos) {
        this.KmsRecorridos = KmsRecorridos;
    }
  


}
