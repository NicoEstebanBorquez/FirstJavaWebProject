package web;
import dominio.Movil;
import datos.MovilDaoJDBC;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.accionDefault(request, response);
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Movil> moviles1 = new MovilDaoJDBC().listar();
        
        HttpSession sesion = request.getSession();
        
        //Listado de moviles
        sesion.setAttribute("moviles2", moviles1);
        
        //Respuesta
        response.sendRedirect("moviles.jsp");
    }
}
