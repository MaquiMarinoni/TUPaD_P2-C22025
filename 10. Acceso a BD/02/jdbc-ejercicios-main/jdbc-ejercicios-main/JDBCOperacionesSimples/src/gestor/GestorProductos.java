package gestor;

import config.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestorProductos {

    //Agregar un nuevo producto (Create)
    public void agregarProducto(String nombre, String descripcion, double precio, int cantidad) {
        //1- Defino la consulta SQL con los parámetros
        String sql = "INSERT INTO productos (nombre, descripcion, precio, cantidad) VALUES (?, ?, ?, ?)";

        //2- Abro una conexión y preparamos la consulta
        try (Connection conn = DatabaseConnection.getConnection(); //con esta línea abro la conexión
                /*
                con PreparedStatement preparo la consulta
                @Statement.RETURN_GENERATED_KEYS obtengo el ID que me genera la base de datos
                 */ PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            //3- Asigno los valores a los ? del SQL
            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.setDouble(3, precio);
            stmt.setInt(4, cantidad);

            //4- Ejecuto la inserción de los datos agregados en la base de datos
            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                try (ResultSet generateKeys = stmt.getGeneratedKeys()) {
                    if (generateKeys.next()) {
                        //4.1- Obtengo el ID que me genera la base de datos de forma automática
                        int nuevoID = generateKeys.getInt(1);
                        System.out.println("Producto agregado con ID: " + nuevoID);
                    }
                }
            } else {
                System.out.println("No se pudo agregar el producto.");
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar el producto: " + e.getMessage());
        }
    }

    //Mostrar producto (obtengo un producto desde la base de datos por su ID) - (Read)
    public void mostrarProducto(String id) {
        //1- Consulta SQL
        String sql = "SELECT * FROM productos WHERE id = ?";

        //2- Abro una conexión y preparamos la consulta
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, Integer.parseInt(id)); //asigno los valores a la consulta
            /*
            uso ResultSet para obtener los resultados de la tabla, ya que es una estructura de datos especial.
            Representa el conjunto de resultados de una consulta SQL, permitiendo recorrer los datos y  acceder a 
            ellos
             */
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("Producto encontrado: ");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Descripción: " + rs.getString("descripcion"));
                System.out.println("Precio: " + rs.getDouble("precio"));
                System.out.println("Cantidad: " + rs.getInt("cantidad"));
            } else {
                System.out.println("Producto no encontrado");
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar el producto: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("ID inválido: " + e.getMessage());
        }
    }

    //Listar productos (obtengo todos los productos de la base de datos) - (Read)
    public void listarProductos() {
        String sql = "SELECT * FROM productos";

        List<String> productos = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                productos.add(String.format("ID: %d | Nombre: %s | Descripción: %s | Precio: $%.2f | Cantidad: %d",
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getDouble("precio"),
                        rs.getInt("cantidad")));
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los prodcutos: " + e.getMessage());
        }

        if (productos.isEmpty()) {
            System.out.println("No hay productos en la base de datos.");
        } else {
            System.out.println("\nLISTA DE PRODUCTOS: ");
            productos.forEach(System.out::println);
        }
    }

    //Actualizar un producto (Update)
    public void actualizarProducto(String id, String nombre, String descripcion, double precio, int cantidad) {
        String sql = "UPDATE productos SET nombre = ?, descripcion = ?, precio = ?, cantidad = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.setDouble(3, precio);
            stmt.setInt(4, cantidad);
            stmt.setInt(5, Integer.parseInt(id));

            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Producto actualizado con éxito.");
            } else {
                System.out.println("No se encontró el producto con ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar el producto: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("ID inválido: " + e.getMessage());
        }
    }

    //Eliminar un producto (Delete)
    public void eliminarProducto(String id) {
        String sql = "DELETE FROM productos WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, Integer.parseInt(id));

            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Producto eliminado con éxito.");
            } else {
                System.out.println("No se encontró el producto con ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el producto: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("ID inválido: " + e.getMessage());
        }
    }
}
