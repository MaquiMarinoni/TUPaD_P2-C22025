package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    //Datos de conexión - se configuran directamente en el código
    private static final String URL = "jdbc:mysql://localhost:3306/proyectoCrud";
    private static final String USER = "tu-usuario";
    private static final String PASSWORD = "tu-contraseña";

    static {
        try {
            //Carga del driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            //Excepción que se lanza si el driver no esté disponible
            throw new RuntimeException("Error: no se encontró el driver JDBC. ", e);
        }
    }

    /*
    Método para la conexión a la base de datos
        @return Connection si la conexión es exitosa
        @throws SQLException si hay un problema al conectarse
     */
    public static Connection getConnection() throws SQLException {
        //Validación para asegurar que las credenciales no estén vacías
        if (URL == null || URL.isEmpty() || USER == null || USER.isEmpty() || PASSWORD == null || PASSWORD.isEmpty()) {
            throw new SQLException("Configuración de la base de datos óincompleta o inválida.");
        }

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
