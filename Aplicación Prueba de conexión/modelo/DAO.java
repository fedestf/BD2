package modelo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import datos.Archivo;
import datos.Usuario;

public class DAO {
	
	public static MongoClient conectarMongo ()
	{
		MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
		MongoClient mongoClient = new MongoClient(connectionString);
		
		return mongoClient;
	}
	
	public static void desconectarMongo (MongoClient mongoClient)
	{
		mongoClient.close();
	}
	
	public static MongoDatabase crearBase(String nombre)
	{
		MongoClient mongoClient = conectarMongo();
		
		MongoDatabase database = mongoClient.getDatabase(nombre);			
		
		desconectarMongo(mongoClient);
		
		return database;
	}
	
	public static void borrarBase(String nombre)
	{
		MongoClient mongoClient = conectarMongo();
		
		MongoDatabase database = mongoClient.getDatabase(nombre);			
		
		database.drop();
		
		desconectarMongo(mongoClient);
	}	
		
	public static MongoCollection<Document> crearCollection(String nombreBD, String collection)
	{		
		MongoClient mongoClient = conectarMongo();
		
		MongoDatabase database = mongoClient.getDatabase(nombreBD);	
		
		database.createCollection(collection);		
		
		desconectarMongo(mongoClient);			
		
		return database.getCollection(collection);
	}	
	
	
	public static void borrarCollection(String nombreBD, String collection)
	{		
		MongoClient mongoClient = conectarMongo();
		
		MongoDatabase database = mongoClient.getDatabase(nombreBD);	
		
		database.getCollection(collection).drop();	
		
		desconectarMongo(mongoClient);
	}
		
	
	public static void insertarDatoArchivo (String nombreBD, String nombreCollection, Archivo archivo)
	{
		MongoClient mongoClient = DAO.conectarMongo();
		
		MongoDatabase database = mongoClient.getDatabase(nombreBD);
		
		Document dato = new Document("nombre", archivo.getNombre());
		dato.append("ruta", archivo.getRuta());
		dato.append("oculto", archivo.getOculto());
		
		MongoCollection<Document> collection = database.getCollection(nombreCollection);
		
		collection.insertOne(dato);
		
		DAO.desconectarMongo(mongoClient);
	}

	
	public static void insertarDatoUsuario (String nombreBD, String nombreCollection, Usuario usuario)
	{
		MongoClient mongoClient = DAO.conectarMongo();
		
		MongoDatabase database = mongoClient.getDatabase(nombreBD);
		
		Document dato = new Document("user", usuario.getUser());
		dato.append("pass", usuario.getPass());
		dato.append("admin", usuario.getAdmin());
		
		MongoCollection<Document> collection = database.getCollection(nombreCollection);
		
		collection.insertOne(dato);
		
		DAO.desconectarMongo(mongoClient);
	}
}
