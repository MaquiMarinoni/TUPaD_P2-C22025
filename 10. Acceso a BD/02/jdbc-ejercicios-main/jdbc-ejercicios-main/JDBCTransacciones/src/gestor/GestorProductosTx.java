/*
Clase Java que hace uso de transacciones
En base de datos una transacción es un conjunto de operaciones que deben ejecutarse en forma atómica.
Quiere decir que si todo funciona bien, los cambios se guardan en la base de datos, haciendo uso de un COMMIT()
Pero si hay un error, se revierten los cambios, haciendo uso del ROLLBACK()
 */
package gestor;

import config.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.locks.StampedLock;

public class GestorProductosTx {

    //Agregar producto
    public Optional<Integer> agregarProducto(String nombre, String descripcion, double precio, int cantidad) {
        String sql = "INSERT INTO productos (nombre, descripcion, precio, cantidad) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection()) {
            conn.setAutoCommit(false); //desactivo el autocomit para poder manejar transacciones

            try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, nombre);
                stmt.setString(2, descripcion);
                stmt.setDouble(3, precio);
                stmt.setInt(4, cantidad);

                int filasAfectadas = stmt.executeUpdate();

                if (filasAfectadas > 0) {
                    try (ResultSet generateKeys = stmt.getGeneratedKeys()) {
                        if (generateKeys.next()) {
                            int nuevoID = generateKeys.getInt(1);
                            conn.commit(); //confirmo la transacción (guardo los datos en la base de datos)
                            System.out.println("Producto agregado con ID: " + nuevoID);
                            return Optional.of(nuevoID);
                        }
                    }
                }
            } catch (SQLException e) {
                conn.rollback(); //si existe un error, se revierte la transacción
                System.out.println("Error al agregar el producto, transacción revertida.");
            } finally {
                conn.setAutoCommit(true); //restauro el auto-commit
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión a la base de datos.");
        }
        return Optional.empty();
    }

    //Mostrar producto por su ID
    public void mostrarProducto(String id) {
        String sql = "SELECT * FROM productos WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, Integer.parseInt(id));

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

    //Listar productos
    public void listarProductos() {
        String sql = "SELECT * FROM productos";
        List<String> productos = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                productos.add(String.format("ID: %d | Nombre: %s | Precio: $%.2f | Cantidad: %d",
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getInt("cantidad")));
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al listar los productos: " + e.getMessage());
        }

        if (productos.isEmpty()) {
            System.out.println("No hay productos en la base de datos.");
        } else {
            System.out.println("\nLISTA DE PRODUCTOS:");
            productos.forEach(System.out::println);
        }
    }

    //Actualizar producto por su ID
    public boolean actualizarProducto(int id, String nombre, String descripcion, double precio, int cantidad) {
        String sql = "UPDATE productos SET nombre = ?, descripcion = ?, precio = ?, cantidad = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection()) {
            conn.setAutoCommit(false); //desactivo el autocomit para poder manejar transacciones

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nombre);
                stmt.setString(2, descripcion);
                stmt.setDouble(3, precio);
                stmt.setInt(4, cantidad);
                stmt.setInt(5, id);

                int filasAfectadas = stmt.executeUpdate();

                if (filasAfectadas > 0) {
                    conn.commit(); //confirmo la transacción (guardo los datos en la base de datos)
                    System.out.println("✅ Producto actualizado con éxito.");
                    return true;
                } else {
                    System.out.println("❌ No se encontró el producto con ID: " + id);
                }
            } catch (SQLException e) {
                conn.rollback(); //si existe un error, se revierte la transacción
                System.out.println("❌ Error al actualizar producto, transacción revertida.");
            } finally {
                conn.setAutoCommit(true); //restauro el auto-commit
            }
        } catch (SQLException e) {
            System.out.println("❌ Error de conexión a la base de datos.");
        }
        return false;
    }

    //Eliminar producto por su ID
    public boolean eliminarProducto(int id) {
        String sql = "DELETE FROM productos WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection()) {
            conn.setAutoCommit(false);

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                int filasAfectadas = stmt.executeUpdate();

                if (filasAfectadas > 0) {
                    conn.commit();
                    System.out.println("✅Producto eliminado con éxito.");
                    return true;
                } else {
                    System.out.println("❌No se encontró el producto con ID: " + id);
                }
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("❌Error al eliminar producto, transacción revertida.");
            } finally {
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            System.out.println("❌Error de conexión a la base de datos.");
        }
        return false;
    }
}
