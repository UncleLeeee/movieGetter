package com.lee.movieDAOs;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.lee.movieBeans.MetaDataBean;
import com.lee.movieBeans.ReviewBean;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class RTInfoDAO implements MoviesDAO<MetaDataBean> {
	
	private DBCollection collection;
	
	public RTInfoDAO(DBCollection coll) {
		this.collection = coll;
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
		BasicDBObject query = new BasicDBObject("id", id);
		DBObject res = this.collection.findOne(query);
		String json = JSON.serialize(res);
		Gson gson = new Gson();
		MetaDataBean bean = gson.fromJson(json, MetaDataBean.class);
		return bean;
	}

	@Override
	public List<MetaDataBean> findAll() throws Exception {
		List<MetaDataBean> list = new ArrayList<MetaDataBean>();
		DBCursor cursor = this.collection.find();
		Gson gson = new Gson();
		while(cursor.hasNext()){
			DBObject res = cursor.next();
			String json = JSON.serialize(res);
			MetaDataBean bean = gson.fromJson(json, MetaDataBean.class);
			list.add(bean);
		}
		return list;
	}

	@Override
	public MetaDataBean findById(int id, String[] fields) throws Exception {
		BasicDBObject keys = new BasicDBObject(fields.length);
		for(int i=0;i<fields.length;i++){
			keys.put(fields[i], 1);
		}
		BasicDBObject query = new BasicDBObject("id", id);
		DBObject res = this.collection.findOne(query, keys);
		String json = JSON.serialize(res);
		Gson gson = new Gson();
		MetaDataBean bean = gson.fromJson(json, MetaDataBean.class);
		bean.setId(id);
		return bean;
	}

	@Override
	public List<MetaDataBean> findAll(String[] fields) throws Exception {
		BasicDBObject keys = new BasicDBObject(fields.length);
		for(int i=0;i<fields.length;i++){
			keys.put(fields[i], 1);
		}
		List<MetaDataBean> list = new ArrayList<MetaDataBean>();
		DBCursor cursor = this.collection.find(new BasicDBObject(),keys);
		Gson gson = new Gson();
		while(cursor.hasNext()){
			DBObject res = cursor.next();
			String json = JSON.serialize(res);
			MetaDataBean bean = gson.fromJson(json, MetaDataBean.class);
			list.add(bean);
		}
		return list;
	}

	@Override
	public void update(MetaDataBean t, String[] fields) throws Exception {
		// TODO Auto-generated method stub
		BasicDBObject property = new BasicDBObject();
		Class clazz = MetaDataBean.class;
		for(int i=0;i<fields.length;i++){
			PropertyDescriptor pd = new PropertyDescriptor(fields[i], clazz);
			Method read = pd.getReadMethod();
			Object res = read.invoke(t);
			Gson gson = new Gson();
			String json = gson.toJson(res);
			property.append(fields[i], JSON.parse(json));
//			System.out.println(((ReviewBean)res).getReviews().toString());
		}
		
		BasicDBObject query = new BasicDBObject("$set", property);
		System.out.println(JSON.serialize(query));
		System.out.println(this.collection.update(new BasicDBObject("id",t.getId()), query,true,false));
	}
	
}
