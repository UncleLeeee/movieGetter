package com.lee.mongoHelper;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;

public class Client {
	
	
	private volatile static MongoClient clientInstance;
	
	private Client(){
		
	}
	public static MongoClient getInstance(){
		if(clientInstance == null){
			synchronized (Client.class) {
				if(clientInstance == null){
					try {
						clientInstance = new MongoClient("localhost", 27017);
					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return clientInstance;
	}
	
}
