package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ProductoImp;
import model.TblProductosusti;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombresusti = request.getParameter("nombresusti");
		double preciocompsusti = Double.parseDouble(request.getParameter("preciocompsusti"));
		double precioventasusti = Double.parseDouble(request.getParameter("precioventasusti"));
		String estadosusti = request.getParameter("estadosusti");
		String descripsusti = request.getParameter("descripsusti");
		
		TblProductosusti tblprod = new TblProductosusti();
		ProductoImp prodimp = new ProductoImp();
		
		
		tblprod.setNombresusti(nombresusti);
		tblprod.setPreciocompsusti(preciocompsusti);
		tblprod.setPrecioventasusti(precioventasusti);
		tblprod.setEstadosusti(estadosusti);
		tblprod.setDescripsusti(descripsusti);

		
		prodimp.RegistrarProducto(tblprod);

		
		List<TblProductosusti> listado = prodimp.ListarProducto();

		
		request.setAttribute("listado", listado);

		
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
	}

}
