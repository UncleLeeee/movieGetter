package com.lee.movieBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.lee.movieBeans.rtInfo.AlterId;
import com.lee.movieBeans.rtInfo.CastInfo;
import com.lee.movieBeans.rtInfo.DirectorInfo;
import com.lee.movieBeans.rtInfo.Links;
import com.lee.movieBeans.rtInfo.Posters;
import com.lee.movieBeans.rtInfo.Ratings;
import com.lee.movieBeans.rtInfo.ReleaseDates;
import com.lee.movieBeans.rtInfo.Reviews;

public class MetaDataBean implements Serializable{
	//Rotten Tomato的电影id号
	private int id;
	//电影名
	private String title;
	//电影出品年
	private int year;
	//存放电影流派的列表
	public List<String> genres = new ArrayList<String>();
	//mpaa评级
	private String mpaa_rating;
	//电影时长
	private int runtime;
	//达成共识的影评
	private String critics_consensus;
	//发行时间
	public ReleaseDates release_dates;
	//相关评分信息（包括评论家和观众）
	public Ratings ratings;
	//内容简介
	private String synopsis;
	//海报链接
	public Posters posters;
	//演员信息表
	public List<CastInfo> abridged_cast = new ArrayList<CastInfo>();
	//导演表
	public List<DirectorInfo> abridged_directors = new ArrayList<DirectorInfo>();
	//工作室
	private String studio;
	//其他id（就是imdb数据库id）
	public AlterId alternate_ids;
	//相关链接
	private Links links;
	//链接模板
	private String link_template;
	//相关评论
	public ReviewBean reviews = new ReviewBean();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public String getMpaa_rating() {
		return mpaa_rating;
	}
	public void setMpaa_rating(String mpaa_rating) {
		this.mpaa_rating = mpaa_rating;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public String getCritics_consensus() {
		return critics_consensus;
	}
	public void setCritics_consensus(String critics_consensus) {
		this.critics_consensus = critics_consensus;
	}
	public ReleaseDates getRelease_dates() {
		return release_dates;
	}
	public void setRelease_dates(ReleaseDates release_dates) {
		this.release_dates = release_dates;
	}
	public Ratings getRatings() {
		return ratings;
	}
	public void setRatings(Ratings ratings) {
		this.ratings = ratings;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public Posters getPosters() {
		return posters;
	}
	public void setPosters(Posters posters) {
		this.posters = posters;
	}
	public List<CastInfo> getAbridged_cast() {
		return abridged_cast;
	}
	public void setAbridged_cast(List<CastInfo> abridged_cast) {
		this.abridged_cast = abridged_cast;
	}
	public List<DirectorInfo> getAbridged_directors() {
		return abridged_directors;
	}
	public void setAbridged_directors(List<DirectorInfo> abridged_directors) {
		this.abridged_directors = abridged_directors;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public AlterId getAlternate_ids() {
		return alternate_ids;
	}
	public void setAlternate_ids(AlterId alternate_ids) {
		this.alternate_ids = alternate_ids;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	public String getLink_template() {
		return link_template;
	}
	public void setLink_template(String link_template) {
		this.link_template = link_template;
	}
	public ReviewBean getReviews() {
		return reviews;
	}
	public void setReviews(ReviewBean reviews) {
		this.reviews = reviews;
	}
	
	
}
