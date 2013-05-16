package com.lee.movieDAOs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bson.BSONObject;

import com.google.gson.Gson;
import com.lee.movieBeans.finalDataBean;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class FinalDataDAO implements MoviesDAO<finalDataBean> {
	
	DBCollection collection = null;
	
	public FinalDataDAO(DBCollection coll) {
		this.collection = coll;
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
		List<finalDataBean> list = new ArrayList<finalDataBean>();
		BasicDBObject keys = new BasicDBObject();
		keys.put("imdb_id", 1);
		keys.put("title", 1);
		keys.put("imdb_url", 1);
		keys.put("plot_simple",1);
		DBCursor cursor = this.collection.find(new BasicDBObject(), keys);
		while(cursor.hasNext()){
			BasicDBObject res = (BasicDBObject) cursor.next();
			//res.put("imdb_id", ((String)res.get("imdb_id")).substring(2, 9));
			String json = JSON.serialize(res);
			Gson gson = new Gson();
			finalDataBean bean = gson.fromJson(json, finalDataBean.class);
			list.add(bean);
		}
		return list;
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
