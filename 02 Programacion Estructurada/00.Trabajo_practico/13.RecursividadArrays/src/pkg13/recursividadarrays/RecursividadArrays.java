/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.recursividadarrays;

/**
 *
 * @author marin
 */
public class RecursividadArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array de ejemplo con precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // Imprimimos el array original usando recursividad
        System.out.println("Precios originales:");
        imprimirRec(precios, 0);

        // Modificamos el tercer elemento (índice 2)
        precios[2] = 129.99;

        // Imprimimos el array modificado usando recursividad
        System.out.println("Precios modificados:");
        imprimirRec(precios, 0);
    }

    // Función recursiva que imprime arr[i] y luego avanza
    static void imprimirRec(double[] arr, int i) {
        // Caso base: si i llegó al final, cortamos la recursión
        if (i >= arr.length) {
            return;
        }
        // Paso recursivo: mostramos el elemento actual y llamamos con i+1
        System.out.println("precio[" + i + "] = " + arr[i]);
        imprimirRec(arr, i + 1);
    }
}