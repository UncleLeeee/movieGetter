package com.lee.getmovies;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class RTInfoAliasGetter implements APIGetter {
	private static String baseUrl = "http://api.rottentomatoes.com/api/public/v1.0/movie_alias.json?";
	private static String[] apikey = {"2wf4n3y52bt59mhb9bmbhwkp","7qy4j8nre2tkwdkkjpbbceyf","jzyv5w7nzw5tmacn83grbvfg"};
	private static String id_type = "imdb"; 
	
	private static int counter = 0;
	
	
	private String id = "";
	
	public RTInfoAliasGetter(String id) {
		this.id = id.substring(2, 9);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getQueryString() {
		String key = apikey[counter%3];
		this.counter ++;
		System.out.println("Use Key: "+key);
		return baseUrl + "id=" + this.id + "&type=" + this.id_type + "&apikey="+key;
	}

	@Override
	public boolean jsonIsNull(String json) {
		JsonElement je = new JsonParser().parse(json);
		JsonObject jo = je.getAsJsonObject();
		if(null!=jo.get("error")) return true;
		return false;
	}
	
	
}
