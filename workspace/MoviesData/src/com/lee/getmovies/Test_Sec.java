package com.lee.getmovies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lee.movieBeans.MetaDataBean;
import com.lee.movieBeans.ReviewBean;
import com.lee.movieBeans.finalDataBean;
import com.lee.movieBeans.rtInfo.Reviews;
import com.lee.movieDAOs.MoviesDAOFactory;
import com.mongodb.DBCursor;

public class Test_Sec {
	private static String testUrl = "http://api.rottentomatoes.com/api/public/v1.0/movies/12989/reviews.json?review_type=top_critic&page_limit=10&page=1&country=us&apikey=2wf4n3y52bt59mhb9bmbhwkp";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String[] str = {"id", "title"};
			List<MetaDataBean> aList = MoviesDAOFactory.getRTInfoDAOInstance().findAll(str);
			List<MetaDataBean> list = aList.subList(2670, aList.size());
			Iterator<MetaDataBean> iter = list.iterator();
			int counter1 = 2670;
			int counter2 = 2122;
			while(iter.hasNext()){
				MetaDataBean bean = iter.next();
				RTReviewsGetter review = new RTReviewsGetter(bean.getId());
				String res = "";
				try {
					res = MoviesGetter.sendQuery(review);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
				}
				Gson gson = new Gson();
				ReviewBean rBean;
				try {
					if(null != res){
						rBean = gson.fromJson(res, ReviewBean.class);
						bean.setReviews(rBean);
						String[] str2 = {"reviews"};
						MoviesDAOFactory.getRTInfoDAOInstance().update(bean, str2);
						counter2++;
					}
					else{
						System.out.println(bean.getId());
						System.out.println(bean.getTitle());
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				counter1++;
				System.out.println("Already Handled: "+counter1);
				System.out.println("Updated: "+counter2);
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
