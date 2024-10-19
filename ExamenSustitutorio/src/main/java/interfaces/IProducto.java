package interfaces;

import java.util.List;
import model.TblProductosusti;

public interface IProducto {
	void RegistrarProducto(TblProductosusti producto);
	void ActualizarProducto(TblProductosusti producto);
	void EliminarProducto(TblProductosusti producto);
	List<TblProductosusti> ListarProducto();
	TblProductosusti BuscarProducto(TblProductosusti producto);
}
