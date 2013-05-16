package com.lee.movieDAOs;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.lee.movieBeans.readyMoviesBean;
import com.lee.mongoHelper.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class readyMoviesDAO implements MoviesDAO<readyMoviesBean>{

	DBCollection collection = null;
	
	public readyMoviesDAO(DBCollection coll) {
		this.collection = coll;
	}
	@Override
	public boolean insertOne(readyMoviesBean t) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public readyMoviesBean findByName(String name) throws Exception {
		DBObject query = new BasicDBObject("name",name);
		BasicDBObject res = (BasicDBObject) this.collection.findOne(query);
		String json = JSON.serialize(res);
		Gson gson = new Gson();
		readyMoviesBean bean = gson.fromJson(json, readyMoviesBean.class);
		return bean;
	}

	@Override
	public List<readyMoviesBean> findAll() throws Exception {
		List<readyMoviesBean> list = new ArrayList<readyMoviesBean>();
		DBCursor cursor = this.collection.find();
		while(cursor.hasNext()){
			BasicDBObject res = (BasicDBObject) cursor.next();
			String json = JSON.serialize(res);
			Gson gson = new Gson();
			readyMoviesBean bean = gson.fromJson(json, readyMoviesBean.class);
			list.add(bean);
		}
		return list;
	}
	@Override
	public readyMoviesBean findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public readyMoviesBean findById(int id, String[] fields) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<readyMoviesBean> findAll(String[] fields) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(readyMoviesBean t, String[] fields) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
