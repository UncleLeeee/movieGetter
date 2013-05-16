package com.lee.mongoHelper;

import com.mongodb.DB;
import com.mongodb.DBCollection;

public class MongoConnection {
	private DB db;
	private String connectionDatabase;
	
	
	public DB getDb() {
		return db;
	}


	public void setDb(DB db) {
		this.db = db;
	}


	public String getConnectionDatabase() {
		return connectionDatabase;
	}


	public void setConnectionDatabase(String connectionDatabase) {
		this.connectionDatabase = connectionDatabase;
	}


	public DBCollection getCollection(String dbName,String collName){
		this.connectionDatabase = dbName;
		this.db = Client.getInstance().getDB(dbName);
		return this.db.getCollection(collName);
	}
}
