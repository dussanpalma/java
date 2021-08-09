<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <h1>Usuarios Registrados</h1>
        
        Usuario confirmado:<br/><br/> 
        
        Nombre: <%= request.getParameter("nombre") %> 
        <br/><br/>
        &nbsp; Apellido: <%= request.getParameter("apellido") %>
        <br/><br/>
        CC: <%= request.getParameter("cc") %>  
        <br/><br/>
        &nbsp; Ciudad: <%= request.getParameter("ciudad") %>
        <br/><br/>
        &nbsp; Genero: <%= request.getParameter("genero") %>
                
        
    </body>
</html>
