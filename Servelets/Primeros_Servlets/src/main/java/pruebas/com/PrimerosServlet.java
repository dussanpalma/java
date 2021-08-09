package pruebas.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PrimerosServlet", urlPatterns = {"/PrimerosServlet"})
public class PrimerosServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PrimerosServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PrimerosServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Especificamos formato de repuesta
        
        PrintWriter salida=response.getWriter();        
        
        // Generar la respuesta
        
        salida.println("<html><body>");
        salida.println("<h1 style='text-aling:center'>Prueba Servlet</h1>");
        salida.print("");
        salida.print("");
        salida.print("");
        salida.print("");
        salida.print("Fecha y hora actual: " + new Date());
        salida.println("</body></html>");
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
