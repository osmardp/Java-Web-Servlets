package administrador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String valor = request.getParameter("clave1");//Clave - valor
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola mundo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola mundo:"+valor+"</h1>");
            out.println("</body>");
            out.println("</html>");
        HttpSession session = request.getSession();
        session.setAttribute("claveatributo", valor);
    }
}
