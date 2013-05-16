package com.lee.movieDAOs;

import com.lee.movieBeans.MetaDataBean;
import com.lee.movieBeans.finalDataBean;
import com.lee.movieBeans.readyMoviesBean;

public class MoviesDAOFactory {
	public static MoviesDAO<readyMoviesBean> getReadyMoviesDAOInstance(){
		return new readyMoviesDAOProxy();
	}
	
	public static MoviesDAO<finalDataBean> getFinalDataDAOInstance(){
		return new FinalDataDAOProxy();
	}
	
	public static MoviesDAO<MetaDataBean> getRTInfoDAOInstance(){
		return new RTInfoDAOProxy();
	}
}
