package com.lee.movieDAOs;

import java.util.List;

import com.lee.mongoHelper.MongoConnection;
import com.lee.movieBeans.readyMoviesBean;

public class readyMoviesDAOProxy implements MoviesDAO<readyMoviesBean>{
	
	private MongoConnection connection = null;
	private readyMoviesDAO dao = null;
	
	private String dbName = "Movies";
	private String collName = "readyMovies";
	
	
	public readyMoviesDAOProxy() {
		this.connection = new MongoConnection();
		this.dao = new readyMoviesDAO(this.connection.getCollection(dbName, collName));
	}

	@Override
	public boolean insertOne(readyMoviesBean t) throws Exception {
		
		return false;
	}

	@Override
	public readyMoviesBean findByName(String name) throws Exception {
		return this.dao.findByName(name);
	}

	@Override
	public List<readyMoviesBean> findAll() throws Exception {
		// TODO Auto-generated method stub
		return this.dao.findAll();
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
