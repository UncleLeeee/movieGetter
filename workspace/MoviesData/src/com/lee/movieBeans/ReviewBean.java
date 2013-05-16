package com.lee.movieBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.lee.movieBeans.rtInfo.BeanLinks;
import com.lee.movieBeans.rtInfo.Reviews;

public class ReviewBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int total;
	private Reviews[] reviews = new Reviews[20];
	private String link_template;
	private BeanLinks links;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Reviews[] getReviews() {
		return reviews;
	}
	public void setReviews(Reviews[] reviews) {
		this.reviews = reviews;
	}
	public String getLink_template() {
		return link_template;
	}
	public void setLink_template(String link_template) {
		this.link_template = link_template;
	}
	public BeanLinks getLinks() {
		return links;
	}
	public void setLinks(BeanLinks links) {
		this.links = links;
	}
	
}
