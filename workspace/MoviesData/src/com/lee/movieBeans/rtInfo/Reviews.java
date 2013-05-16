package com.lee.movieBeans.rtInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 评论类
 * @author unclelee
 *
 */
public class Reviews implements Serializable{
	private String critic;
	private String date;
	private String original_score;
	private String freshness;
	private String publication;
	private String quote;
	public ReviewLinks links;
	public String getCritic() {
		return critic;
	}
	public void setCritic(String critic) {
		this.critic = critic;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getOriginal_score() {
		return original_score;
	}
	public void setOriginal_score(String original_score) {
		this.original_score = original_score;
	}
	public String getFreshness() {
		return freshness;
	}
	public void setFreshness(String freshness) {
		this.freshness = freshness;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public ReviewLinks getLinks() {
		return links;
	}
	public void setLinks(ReviewLinks links) {
		this.links = links;
	}
	
}