/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.muestraenums;

/**
 *
 * @author AGUSTIN
 */
public class Main {

   public static void main(String[] args) {

        Empresa e = new Empresa();

        e.agregarPersona(new Persona("Pepe", "Fulano", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Maria", "Sultana", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Luis", "Mengano", NivelEstudio.TERCIARIO));
        e.agregarPersona(new Persona("Lito", "García", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Arón", "Quilez", NivelEstudio.PRIMARIO));
        e.agregarPersona(new Persona("Rita", "Perez", NivelEstudio.UNIVERSITARIO));
        e.agregarPersona(new Persona("Alex", "Gomez", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Sara", "Jerez", NivelEstudio.SECUNDARIO));

        e.mostrarPorNivel(NivelEstudio.SECUNDARIO);
    }
}