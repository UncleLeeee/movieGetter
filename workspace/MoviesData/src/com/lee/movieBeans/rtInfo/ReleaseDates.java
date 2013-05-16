package com.lee.movieBeans.rtInfo;

 /**
 * 发行时间类
 * @author unclelee
 *
 */
public class ReleaseDates{
	private String theater;
	private String dvd;
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public String getDvd() {
		return dvd;
	}
	public void setDvd(String dvd) {
		this.dvd = dvd;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ReleaseDates: \n"+"Theater: "+this.theater+"\nDVD: "+this.dvd;
	}
} 
