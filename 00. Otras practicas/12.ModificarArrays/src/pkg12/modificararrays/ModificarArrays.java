/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.modificararrays;

/**
 *
 * @author marin
 */
public class ModificarArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creamos un arreglo (array) de precios con valores de ejemplo
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // Mostramos los precios originales
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("precio[" + i + "] = " + precios[i]);
        }

        // Modificamos el tercer elemento (índice 2, porque el índice empieza en 0)
        precios[2] = 129.99;

        // Mostramos los precios luego del cambio
        System.out.println("Precios modificados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("precio[" + i + "] = " + precios[i]);
        }
    }
}
