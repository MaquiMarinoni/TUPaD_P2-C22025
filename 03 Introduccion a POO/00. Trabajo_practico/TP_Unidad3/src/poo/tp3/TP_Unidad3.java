/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.tp3;

/**
 *
 * @author marin
 */
public class TP_Unidad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // CLASE ESTUDIANTE
        
        Estudiante e = new Estudiante();
        e.setNombre("Macarena");
        e.setApellido("Marinoni");
        e.setCurso("Programacion II");
        e.setCalificacion(6);
        
        // Estado inicial
        e.mostrarInfo();
        
        // Aumenta calificación +1.2
        e.subirCalificacion(1.2);
        e.mostrarInfo();

        // Disminuye calificación -3.0
        e.bajarCalificacion(3.0);
        e.mostrarInfo();

        // Intento de subir por encima de 10 -> se limita
        e.subirCalificacion(20);
        e.mostrarInfo();
        
        
        
        // CLASE MASCOTAS
        
        Mascota m = new Mascota();
        m.setNombre("Tita");
        m.setEspecie("Gato");
        m.setEdad(5);
        
                // Estado inicial
        m.mostrarInfo();        // Mascota: Luna (Gato) | Edad: 2

        // Cambia el estado con un método
        m.cumplirAnios();
        m.mostrarInfo();        // Edad: 3

        // Probamos la validación de edad (no debería quedar negativa)
        m.setEdad(-5);
        m.mostrarInfo();        // Edad: 0



        // CLASE LIBROS
        
        Libro l = new Libro();
        
        l.setTitulo("IT");
        l.setAutor("King, Stephen");

        // Intento inválido
        l.setAnioPublicacion(3000); // mensaje: Año inválido... No se modifica.

        // Intento válido
        l.setAnioPublicacion(2008);

        // Mostrar información final usando getters
        System.out.println("Libro: " + l.getTitulo() + " (" + l.getAutor() + ") - Año: " + l.getAnioPublicacion());
    
    
        // CLASE GALLINA
        
        // Creamos dos gallinas con constructor por defecto (implícito)
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        // Cargamos datos con setters
        g1.setIdGallina(101);
        g1.setEdad(1);
        g1.setHuevosPuestos(0);

        g2.setIdGallina(102);
        g2.setEdad(2);
        g2.setHuevosPuestos(5);

        // Estado inicial
        g1.mostrarEstado();  // Gallina #101 | Edad: 1 | Huevos: 0
        g2.mostrarEstado();  // Gallina #102 | Edad: 2 | Huevos: 5

        // Simulamos acciones
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        // Estado final

        g1.mostrarEstado();  // Huevos: 2 | Edad: 2
        g2.mostrarEstado();  // Huevos: 6 | Edad: 4
        
    
        
        // CLASE NAVE ESPACIAL
        
        NaveEspacial nave = new NaveEspacial();

        nave.setNombre("Andromeda");
        nave.setCombustible(50);
        nave.mostrarEstado();

        nave.despegar();
        nave.avanzar(80);           
        nave.mostrarEstado();

        nave.recargarCombustible(60); 
        nave.mostrarEstado();

        nave.avanzar(80);          
        nave.mostrarEstado();
    
    
    }

}
    