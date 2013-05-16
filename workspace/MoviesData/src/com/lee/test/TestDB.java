package com.lee.test;

import java.util.List;

import com.lee.movieBeans.readyMoviesBean;
import com.lee.movieDAOs.MoviesDAOFactory;

public class TestDB {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<readyMoviesBean> list = MoviesDAOFactory.getReadyMoviesDAOInstance().findAll();
		List<readyMoviesBean> sub = list.subList(13611, list.size());
		System.out.println("0: "+sub.get(0));
	}

}
