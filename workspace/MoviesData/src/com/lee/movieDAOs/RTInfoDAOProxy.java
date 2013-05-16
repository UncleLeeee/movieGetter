package com.lee.movieDAOs;

import java.util.List;

import com.lee.mongoHelper.MongoConnection;
import com.lee.movieBeans.MetaDataBean;

public class RTInfoDAOProxy implements MoviesDAO<MetaDataBean> {

	
	private MongoConnection connection = null;
	private RTInfoDAO dao = null;
	
	private String dbName = "Movies";
	private String collName = "MovieData";
	
	public RTInfoDAOProxy() {
		this.connection = new MongoConnection();
		this.dao = new RTInfoDAO(this.connection.getCollection(dbName, collName));
	}
	@Override
	public boolean insertOne(MetaDataBean t) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MetaDataBean findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDataBean findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return this.dao.findById(id);
	}

	@Override
	public List<MetaDataBean> findAll() throws Exception {
		// TODO Auto-generated method stub
		return this.dao.findAll();
	}
	@Override
	public MetaDataBean findById(int id, String[] fields) throws Exception {
		// TODO Auto-generated method stub
		return this.dao.findById(id, fields);
	}
	@Override
	public List<MetaDataBean> findAll(String[] fields) throws Exception {
		// TODO Auto-generated method stub
		return this.dao.findAll(fields);
	}
	@Override
	public void update(MetaDataBean t, String[] fields) throws Exception {
		// TODO Auto-generated method stub
		this.dao.update(t, fields);
	}

}
