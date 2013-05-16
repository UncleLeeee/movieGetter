package com.lee.movieDAOs;

import java.util.List;

import com.lee.mongoHelper.MongoConnection;
import com.lee.movieBeans.finalDataBean;

public class FinalDataDAOProxy implements MoviesDAO<finalDataBean> {
	
	private MongoConnection connection = null;
	private FinalDataDAO dao = null;
	
	private String dbName = "Movies";
	private String collName = "finalData";
	
	public FinalDataDAOProxy() {
		this.connection = new MongoConnection();
		this.dao = new FinalDataDAO(this.connection.getCollection(dbName, collName));
	}

	@Override
	public boolean insertOne(finalDataBean t) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public finalDataBean findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<finalDataBean> findAll() throws Exception {
		// TODO Auto-generated method stub
		return this.dao.findAll();
	}

	@Override
	public finalDataBean findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public finalDataBean findById(int id, String[] fields) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<finalDataBean> findAll(String[] fields) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(finalDataBean t, String[] fields) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
