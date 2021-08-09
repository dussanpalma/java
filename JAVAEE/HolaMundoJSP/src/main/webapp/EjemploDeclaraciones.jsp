<%-- 
    Document   : EjemploDeclaraciones
    Created on : 4/08/2021, 11:12:06 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones</title>
    </head>
    <body>


        <h1>
            Ejemplo declaraciones
        </h1>

        <%!
            private int ressultado;

            public int metodoSuma(int num1, int num2) {

                ressultado = num1 + num2;

                return ressultado;

            }

            public int metodoResta(int num1, int num2) {

                ressultado = num1 - num2;

                return ressultado;

            }

            public int metodoMultiplica(int num1, int num2) {

                ressultado = num1 * num2;

                return ressultado;

            }


        %>


        El resultado de la suma es: <%=  metodoSuma(7, 5)%>

        <br>

       El resultado de la resta es: <%=  metodoResta(7, 5)%>

        <br>

       El resultado de la multiplicacion es: <%=  metodoMultiplica(7, 5)%>


    </body>
</html>
