<%-- 
    Document   : ConexionBD_LoginPildoras.jsp
    Created on : 5/08/2021, 03:59:27 PM
    Author     : Usuario
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            
            String usuario = request.getParameter("usuario");
            String contra = request.getParameter("contra");
            
            Class.forName("com.mysql.cj.jdbc.Driver");
               
            
            try {
                      java.sql.Connection miConexion=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios?useSSL=false&serverTimezone=UTC", "root", "admin"); 
                      
                      PreparedStatement c_preparada=miConexion.prepareStatement("SELECT * FROM usuarios WHERE Usuario=? AND Contrasena=?");
                      
                      c_preparada.setString(1, usuario);
                      c_preparada.setString(2, contra);
                      
                      ResultSet miResultSet=c_preparada.executeQuery(); 
                      
                      if(miResultSet.absolute(1)) out.println("Usuario autorizado");
                      
                      else out.println("No existe el usuario");
                      
                } catch (Exception e) {
                    
                     out.print("Ha habido un error");
                }
          


        %>

    </body>
</html>
