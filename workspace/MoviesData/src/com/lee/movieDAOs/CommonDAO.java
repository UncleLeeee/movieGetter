package com.lee.movieDAOs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.util.JSON;

public class CommonDAO {
	public static void insertJson(DBCollection coll,JsonElement je){
		Gson gson = new Gson();
		String json = gson.toJson(je);
        BasicDBObject oneObj = (BasicDBObject) JSON.parse(json);
        coll.insert(oneObj);
	}
}
