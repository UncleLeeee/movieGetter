package com.lee.movieBeans.rtInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 演员信息表
 * @author unclelee
 *
 */
public class CastInfo{
	private String name;
	private String id;
	public List<String> characters = new ArrayList<String>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getCharacters() {
		return characters;
	}
	public void setCharacters(List<String> characters) {
		this.characters = characters;
	}
}
