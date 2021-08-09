<%-- 
    Document   : EjemploExpresiones
    Created on : 4/08/2021, 10:56:46 AM
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
        <h1>Ejemplo de expresiones</h1>
        
        Convirtiendo a mayusculas: <%= new String("dussan").toUpperCase() %>
        
        <br> <%-- Espacio en html --%>
        
        La suma de 5 y 7 es:  <%= 5+7 %> <%-- Expreciones matematicas--%>
        
        <br> <%-- Espacio en html --%>
        
        100 es mayor que 10: <%= 100>10  %> <%-- Expresiones booleanas--%>
        
    </body>
</html>
