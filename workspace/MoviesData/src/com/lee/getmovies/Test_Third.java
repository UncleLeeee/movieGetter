package com.lee.getmovies;

import com.lee.movieBeans.MetaDataBean;
import com.lee.movieDAOs.MoviesDAOFactory;

public class Test_Third {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MetaDataBean bean = MoviesDAOFactory.getRTInfoDAOInstance().findById(12989);
		System.out.println(bean.getReviews().getLinks().getRel());
	}

}
