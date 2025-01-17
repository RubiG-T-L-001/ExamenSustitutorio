package DaoImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IUsuario;
import model.TblUsuariosusti;

public class UsuarioImp implements IUsuario {

	public void RegistrarUsuario(TblUsuariosusti usuario) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ExamenSustitutorio");
		EntityManager em=emf.createEntityManager();
		try{
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally{
		em.close();
		
		}	
	}

}
