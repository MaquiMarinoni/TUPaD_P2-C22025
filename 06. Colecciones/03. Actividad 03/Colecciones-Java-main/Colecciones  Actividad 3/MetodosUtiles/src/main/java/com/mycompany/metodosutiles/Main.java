package com.mycompany.metodosutiles;

/**
 *
 * @author AGUSTIN
 */
public class Main {

    public static void main(String[] args) {
        
        
//        System.out.println(NivelEstudio.PRIMARIO.ordinal());
//        System.out.println(NivelEstudio.PRIMARIO.toString());

//        NivelEstudio[] niveles = NivelEstudio.values();
//        for (int i = 0; i < niveles.length; i++) {
//            System.out.println((i + 1) + ") " + niveles[i]);
//        }
//        int opcUsuario = Consola.leerEntero("Ingrese su nivel de estudios: ");
//        System.out.println("Usted eligió " + niveles[opcUsuario - 1]);


        NivelEstudio.valueOf("PRIMARIO");
        
    }
}