package datos;

import java.sql.*;

// esta clase de conexion la podemos utilizar en diferentes proyectos
public class Conexion {

    // buenas practicas para conectar MySql
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    // creamos un metodo para el getConnection (Conectarse a Mysql) 
    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

    }

    //creamos los metodos para cerrar 
    public static void close(ResultSet rs) throws SQLException {

        rs.close();

    }

    public static void close(PreparedStatement smtm) throws SQLException {

        smtm.close();

    }

    public static void close(Connection conn) throws SQLException {

        conn.close();

    }

}
