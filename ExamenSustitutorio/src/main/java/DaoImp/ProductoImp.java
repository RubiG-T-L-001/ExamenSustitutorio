package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TblProductosusti;

public class ProductoImp implements IProducto{

	public void RegistrarProducto(TblProductosusti producto) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ExamenSustitutorio");
		EntityManager em=emf.createEntityManager();
		try{
		em.getTransaction().begin();
		em.persist(producto);
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally{
		em.close();
		}
	}

	public void ActualizarProducto(TblProductosusti producto) {
		// TODO Auto-generated method stub
		
	}

	public void EliminarProducto(TblProductosusti producto) {
		// TODO Auto-generated method stub
		
	}

	public List<TblProductosusti> ListarProducto() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ExamenSustitutorio");
		EntityManager em=emf.createEntityManager();
		List<TblProductosusti> listado=null;
		try{
		em.getTransaction().begin();
	    listado=em.createQuery("SELECT t FROM TblProductosusti t",TblProductosusti.class).getResultList();
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally{
		em.close();
		}
		return listado;
	}

	public TblProductosusti BuscarProducto(TblProductosusti producto) {
		// TODO Auto-generated method stub
		return null;
	}

}
