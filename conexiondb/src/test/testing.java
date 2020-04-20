package test;
import codigo.*;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;





public class testing {

    public static void main(String[] args) {     
    	
    	MongoClient mongoClient = new MongoClient();
    	MongoDatabase database = mongoClient.getDatabase("mydb");
  
    }    
}