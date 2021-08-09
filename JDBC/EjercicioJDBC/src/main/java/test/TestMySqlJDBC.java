package test;

import java.sql.*;
import java.sql.DriverManager;
public class TestMySqlJDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT id_usuario, usuario, password FROM usuario";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.println("Id Usuario : " + resultado.getInt("id_persona"));
                System.out.println(" Usuario : " + resultado.getString("nombre"));
                System.out.println(" Password : " + resultado.getString("apellido"));
                System.out.println(" ");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        }catch (SQLException ex) {
            ex.printStackTrace(System.out);

        }
    }

}
