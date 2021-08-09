

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String usuario = request.getParameter("usuario");
            String contra = request.getParameter("contra");
            String pais = request.getParameter("pais");
            String tecno = request.getParameter("tecnologias");
            
            Class.forName("com.mysql.cj.jdbc.Driver");
               
            java.sql.Connection miConexion=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios?useSSL=false&serverTimezone=UTC", "root", "admin"); 
            java.sql.Statement miStatement = miConexion.createStatement(); 
            
            String instruccionSql= 
            "INSERT INTO usuarios(Nombre, Apellido, Usuario, Contrasena, Pais, Tecnologia) VALUES('" + nombre + "','" + 
            apellido + "','" + usuario + "','" + contra + "','" + pais + "','" + tecno + "')";
            
             
            miStatement.executeUpdate(instruccionSql);
            
              out.print("Registrado con exito");


        %>

       
          
        
        
        
         




    </body>
</html>
