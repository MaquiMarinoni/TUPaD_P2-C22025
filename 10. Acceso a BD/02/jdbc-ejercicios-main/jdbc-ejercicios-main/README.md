# JDBC Ejercicios

Este repositorio contiene dos proyectos Java usando JDBC:

- `JDBCOperacionesSimples`: Operaciones básicas de CRUD (Crear, Leer, Actualizar, Eliminar) sobre una base de datos.
- `JDBCTransacciones`: Ejemplo de manejo de transacciones con JDBC, incluyendo commits y rollbacks.

---

## 🧱 Base de Datos
Ambos proyectos usan la misma base de datos llamada `proyectoCrud`.

### 🔧 Script SQL para crear la base de datos y la tabla `productos`:

```sql
CREATE DATABASE IF NOT EXISTS proyectoCrud;
USE proyectoCrud;

CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) NOT NULL,
    cantidad INT NOT NULL
);

🛠️ Requisitos
Java (JDK 8 o superior)

NetBeans (proyectos creados con Ant)

MySQL

Conector JDBC (MySQL)

🧪 Cómo ejecutar
Importá cada carpeta como proyecto en NetBeans: JDBCOperacionesSimples y JDBCTransacciones.

Asegurate de tener creada la base de datos con el script anterior.

Verificá que el archivo de conexión (DatabaseConnection.java) tenga los datos correctos para acceder a tu base de datos.

👨‍💻 Autor
Octavio – Proyecto académico para prácticas con JDBC y bases de datos.
