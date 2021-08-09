<%-- 
    Document   : EjemploScriptlet
    Created on : 4/08/2021, 11:06:08 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scriptlet</title>
    </head>
    <body>
        <h1>Ejemplo de scriptlet</h1>


        <%

            for (int i = 0; i < 11; i++) {

                out.println("<br> Este es el mensaje " + i);

            }


        %>




    </body>
</html>
