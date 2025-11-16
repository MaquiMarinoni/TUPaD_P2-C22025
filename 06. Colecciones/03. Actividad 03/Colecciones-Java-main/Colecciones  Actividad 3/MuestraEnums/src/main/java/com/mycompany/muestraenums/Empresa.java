package com.mycompany.muestraenums;
import java.util.ArrayList;

/**
 *
 * @author AGUSTIN
 */
public class Empresa {

    private ArrayList<Persona> listaPersonas;

    public Empresa() {
        this.listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona p) {
        this.listaPersonas.add(p);
    }

    public void mostrarPorNivel(NivelEstudio nivel) {
        for (Persona p : listaPersonas) {
            if (p.getNivelEstudio() == nivel) {
                System.out.println(p);
            }
        }
    }
}