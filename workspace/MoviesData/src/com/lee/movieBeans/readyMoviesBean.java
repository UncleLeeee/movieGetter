package com.lee.movieBeans;

public class readyMoviesBean {
	private String name;
	private int votes;
	private double ratings;
	private String year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Votes: "+this.votes+"\n"+"Ratings: "+this.ratings+"\n"+"Name: "
								+this.name+"\n"+"Year: "+this.year;
	}
}
