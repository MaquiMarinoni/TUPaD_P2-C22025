package config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnectionPool {

    private static final HikariConfig config = new HikariConfig();
    private static final HikariDataSource ds;

    static {
        config.setJdbcUrl("jdbc:mysql://localhost:3306/proyectoCrud");
        config.setUsername("tu-usuario");
        config.setPassword("tu-contraseña");
        config.setMaximumPoolSize(10); //crea un máximo de 10 conexiones simultáneas
        ds = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection(); //obtengo una conexión del pool
    }
}
