package com.lee.getmovies;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lee.movieDAOs.MoviesDAO;

public class RTReviewsGetter implements APIGetter{
	
	private static String baseUrl = "http://api.rottentomatoes.com/api/public/v1.0/movies/";
	private static String[] apikey = {"2wf4n3y52bt59mhb9bmbhwkp","7qy4j8nre2tkwdkkjpbbceyf","jzyv5w7nzw5tmacn83grbvfg"};
	private Integer id;
	private String review_type = "top_critic";
	private Integer page_limit = 20;
	private Integer page = 1;
	private String country = "us";

	
	private static int counter = 0;
	
	public RTReviewsGetter(int id) {
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReview_type() {
		return review_type;
	}

	public void setReview_type(String review_type) {
		this.review_type = review_type;
	}

	public int getPage_limit() {
		return page_limit;
	}

	public void setPage_limit(int page_limit) {
		this.page_limit = page_limit;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String getQueryString() {
		String key = apikey[counter%3];
		this.counter ++;
		System.out.println("Use Key: "+key);
		
		return this.baseUrl + this.id.toString() + "/reviews.json?review_type=" 
						+ this.review_type + "&page_limit=" + this.page_limit 
						+"&page=" + this.page + "&country=" + this.country 
						+"&apikey="+key;
	}

	@Override
	public boolean jsonIsNull(String json) {
		JsonElement je = new JsonParser().parse(json);
		JsonObject jo = je.getAsJsonObject();
		if(jo.get("total").getAsInt() == 0) return true;
		return false;
	}
	
}
