package com.lee.movieBeans;

public class finalDataBean {
	private String imdb_id;
	private String title;
	private String imdb_url;
	private String plot_simple;
	
	public String getPlot_simple() {
		return plot_simple;
	}
	public void setPlot_simple(String plot_simple) {
		this.plot_simple = plot_simple;
	}
	public String getImdb_id() {
		return imdb_id;
	}
	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImdb_url() {
		return imdb_url;
	}
	public void setImdb_url(String imdb_url) {
		this.imdb_url = imdb_url;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Imdb_id: "+this.imdb_id+"\n"+"Imdb_url: "+this.imdb_url+"\n"+"Title: "
		+this.title +"\n" + "Plot_simple: " + this.plot_simple;
	}
}
