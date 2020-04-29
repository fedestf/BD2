package negocio;



import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import datos.Archivo;
import datos.Usuario;
import modelo.DAO;

public class TestConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			Usuario usuario = new Usuario("Agus", "1234", true);
			Archivo archivo = new Archivo("texto.txt", "C:\\", false);
			
			MongoClient mongoClient = DAO.conectarMongo();
			
			MongoDatabase database = DAO.crearBase("UsersBD");
//			MongoCollection<Document> collectionUsuario = 
					DAO.crearCollection(database.getName(), "Usuario");
//			MongoCollection<Document> collectionArchivo = 
					DAO.crearCollection(database.getName(), "Archivo");
			
			DAO.insertarDatoUsuario(database.getName(), "Usuario", usuario);
			DAO.insertarDatoArchivo(database.getName(), "Archivo", archivo);
			
			usuario.setUser("Ru5o");usuario.setPass("5678"); usuario.setAdmin(false);
			archivo.setNombre("pelicula.mkv"); archivo.setRuta("D:\\Media"); archivo.setOculto(true);
			
			DAO.insertarDatoUsuario(database.getName(), "collectionUsuario", usuario);
			DAO.insertarDatoArchivo(database.getName(), "collectionArchivo", archivo);
			
			DAO.desconectarMongo(mongoClient);
	}
}
