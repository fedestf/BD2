package test;
import codigo.*;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;





public class testing {

    public static void main(String[] args) {     
    	
    	MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
    	MongoClient mongoClient = new MongoClient(connectionString);
    	
    	MongoDatabase database = mongoClient.getDatabase("local");
    	
    	System.out.println(database.getName());
    }    
}