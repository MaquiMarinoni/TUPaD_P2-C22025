package main;

import gestor.GestorProductosTx;

public class Main {

    public static void main(String[] args) {
        //Obtengo instancia de GestorPedidoTx
        GestorProductosTx gestor = new GestorProductosTx();

        System.out.println("\n🔹 Agregando productos...");
        //gestor.agregarProducto("Laptop Gamer", "Laptop con procesador i7 y 16GB RAM", 1200.50, 5);
        gestor.agregarProducto("Teclado", "Teclado Gamer", 100.99, 10);

        //System.out.println("\n🔹 Mostrar producto...");
        //gestor.mostrarProducto("1");
        System.out.println("\n🔹 Listando productos...");
        gestor.listarProductos();
        /*
        System.out.println("\n🔹 Actualizando producto con ID 1...");
        gestor.actualizarProducto("1", "Laptop Gamer PRO", "Laptop con procesador i9 y 32GB RAM", 1500.00, 3);

        System.out.println("\n🔹 Listando productos actualizados...");
        gestor.listarProductos();

        System.out.println("\n🔹 Eliminando producto con ID 2...");
        gestor.eliminarProducto("2");

        System.out.println("\n🔹 Listando productos después de eliminación...");
        gestor.listarProductos();
         */
    }

}
