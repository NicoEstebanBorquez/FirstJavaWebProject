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

    List<Movil> moviles1 = new MovilDaoJDBC().listar();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editarMovil(request, response);
                    break;
                case "eliminar":
                    this.eliminarMovil(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws IOException {
        moviles1 = new MovilDaoJDBC().listar();

        HttpSession sesion = request.getSession();

        //Listado de moviles
        sesion.setAttribute("moviles2", moviles1);

        //Total de móviles
        sesion.setAttribute("totalMoviles", moviles1.size());

        //Respuesta
        response.sendRedirect("moviles.jsp");
    }

    public void editarMovil(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Recuperar idMovil
        int idMovil = Integer.parseInt(request.getParameter("idMovil"));

        Movil movil = new Movil(idMovil);
        MovilDaoJDBC movilJDBC = new MovilDaoJDBC();
        movilJDBC.encontrar(movil);

        request.setAttribute("movil", movil);
        String jspEditar = "/WEB-INF/paginas/movil/editarMovil.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }

    public void eliminarMovil(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Recuperar idMovil
        int idMovil = Integer.parseInt(request.getParameter("idMovil"));

        Movil movil = new Movil(idMovil);
        MovilDaoJDBC movilJDBC = new MovilDaoJDBC();
        movilJDBC.eliminar(movil);

        this.accionDefault(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.agregarMovil(request, response);
                    break;
                case "modificar":
                    this.modificarMovil(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }

    }

    private void agregarMovil(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String imei = request.getParameter("imei");
        String tipoReparacion = request.getParameter("tipoReparacion");
        String estado = request.getParameter("estado");
        double precio = Double.parseDouble(request.getParameter("precio"));
        String nombreCliente = request.getParameter("nombreCliente");
        String telefonoCliente = request.getParameter("telefonoCliente");

        Movil movil = new Movil(marca, modelo, imei, tipoReparacion, estado, precio, nombreCliente, telefonoCliente);
        MovilDaoJDBC movilJDBC = new MovilDaoJDBC();
        movilJDBC.insertar(movil);

        this.accionDefault(request, response);
    }

    private void modificarMovil(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int idMovil = Integer.parseInt(request.getParameter("idMovil"));
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String imei = request.getParameter("imei");
        String tipoReparacion = request.getParameter("tipoReparacion");
        String estado = request.getParameter("estado");
        double precio = Double.parseDouble(request.getParameter("precio"));
        String nombreCliente = request.getParameter("nombreCliente");
        String telefonoCliente = request.getParameter("telefonoCliente");

        Movil movil = new Movil(idMovil, marca, modelo, imei, tipoReparacion, estado, precio, nombreCliente, telefonoCliente);
        MovilDaoJDBC movilJDBC = new MovilDaoJDBC();
        movilJDBC.actualizar(movil);

        this.accionDefault(request, response);
    }

}
