package com.lee.movieDAOs;

import java.util.List;

public interface MoviesDAO<T> {
	public boolean insertOne(T t) throws Exception;
	
	public T findByName(String name) throws Exception;
	
	public T findById(int id) throws Exception;
	
	public T findById(int id,String[] fields) throws Exception;
	
	public List<T> findAll() throws Exception;
	
	public List<T> findAll(String[] fields) throws Exception;
	
	public void update(T t,String[] fields) throws Exception; 
}
