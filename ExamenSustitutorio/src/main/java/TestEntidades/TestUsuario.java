package TestEntidades;


import DaoImp.UsuarioImp;
import model.TblUsuariosusti;

public class TestUsuario {

	public static void main(String[] args) {
		TblUsuariosusti tblusu=new TblUsuariosusti();
		UsuarioImp climp=new UsuarioImp();
		
		tblusu.setUsuariosusti("USU");
		tblusu.setPasswordsusti("1234");
		
		climp.RegistrarUsuario(tblusu);
		System.out.println("dato registrado en BD...");

	}

}
