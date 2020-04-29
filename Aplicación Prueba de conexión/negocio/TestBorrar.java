package negocio;

import modelo.DAO;

public class TestBorrar {

	public static void main(String[] args) {

		DAO.borrarBase("UsersBD");
		
//		DAO.borrarCollection("UsersBD", "Usuario");
//		DAO.borrarCollection("UsersBD", "Archivo");

	}

}
