package com.lee.getmovies;

import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lee.mongoHelper.MongoConnection;
import com.lee.movieBeans.finalDataBean;
import com.lee.movieBeans.readyMoviesBean;
import com.lee.movieDAOs.CommonDAO;
import com.lee.movieDAOs.MoviesDAOFactory;

public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int counter = 0;
		try {
			List<finalDataBean> list = MoviesDAOFactory.getFinalDataDAOInstance().findAll();
			Iterator<finalDataBean> iter = list.iterator();
			while(iter.hasNext()){
				long beginTime = System.currentTimeMillis();
				counter ++;
				finalDataBean bean = iter.next();
				RTInfoAliasGetter getRes = new RTInfoAliasGetter(bean.getImdb_id());
				
				String res = null;
				try {
					res = MoviesGetter.sendQuery(getRes);
				} catch (Exception e) {
					// TODO: handle exception
					
				}

				if(null!=res){
					JsonObject jo = new JsonParser().parse(res).getAsJsonObject();
					System.out.println("beanTitle:"+bean.getTitle() +"   imdbTitle:"+jo.get("title").getAsString());
					CommonDAO.insertJson(new MongoConnection().getCollection("Movies", "RTInfo"), jo);
					
				}
				System.out.println(counter);
				long endTime = System.currentTimeMillis();
				long costTime = endTime - beginTime;
				if(costTime<100) Thread.sleep(100 - costTime);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
