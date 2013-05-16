package com.lee.getmovies;

import java.io.UnsupportedEncodingException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class IMDBGetter implements APIGetter{
	private String title = "";
	private String output = "json";
	private PlotType plot = PlotType.Simple;
	private Integer episode = 1;
	private Integer limit = 1;
	private String year = "";
	private Integer yg = 1;
	private static final String mt="M";
	private static final String lang = "en-US";
	private String offset = "";
	private static final String aka = "Simple";
	private static final String release = "Simple";
	private static final Integer bussiness = 0;
	private static final Integer technical = 0;
	
	public IMDBGetter(String title,String year){
		this.title = title;
		this.year = year;
	}
	public IMDBGetter() {
		// TODO Auto-generated constructor stub
	}
	
	public String getQueryString(){
		String qTitle = null;
		try {
			qTitle = java.net.URLEncoder.encode(this.title, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String res = "http://imdbapi.org/?title=" + qTitle +
						"&type="+this.output +"&plot="+this.plot.toString()+"&episode="+this.episode.toString() +
						"&limit="+this.limit.toString()+"&year="+this.year+"&yg="+this.yg.toString()+"&mt="+this.mt +
						"&lang="+this.lang+"&offset="+this.offset+"&aka="+this.aka +
						"&release="+this.release+"&business="+this.bussiness.toString()+"&tech="+this.technical.toString();
		return res;
	}
	
	public enum PlotType{
		None,
		Simple,
		Full
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public void setPlot(PlotType plot) {
		this.plot = plot;
	}
	public void setEpisode(Integer episode) {
		this.episode = episode;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void setYg(Integer yg) {
		this.yg = yg;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}

	@Override
	public boolean jsonIsNull(String json) {
		// TODO Auto-generated method stub
		JsonElement je = new JsonParser().parse(json);
		JsonObject jo = je.getAsJsonObject();
		if(null!=jo.get("error")){
			String test = jo.get("error").getAsString();
			if(test.equals("Film not found")) return true;
		}
		return false;
	}
	
	
}
