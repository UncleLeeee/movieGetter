package com.lee.movieHelper;

public class Movie {
	
	private int votes;
	private double ratings;
	private String name;
	private String year;
	
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Movie(int votes, double ratings, String name, String year) {
		this.votes = votes;
		this.ratings = ratings;
		this.name = name;
		this.year = year;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Votes: "+this.votes+"\n"+"Ratings: "+this.ratings+"\n"+"Name: "
								+this.name+"\n"+"Year: "+this.year;
	}
}
