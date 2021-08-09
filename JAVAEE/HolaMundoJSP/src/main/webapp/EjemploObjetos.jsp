<%-- 
    Document   : EjemploObjetos
    Created on : 4/08/2021, 12:39:10 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Objetos predefinidos JSP</h1>
        
        Petición datos del navegador: <%= request.getHeader("User-Agent")%>
        
        <br/><br/>
        
        Petición idioma utilizado: <%= request.getLocale()%>
        
                
        
        
    </body>
</html>
