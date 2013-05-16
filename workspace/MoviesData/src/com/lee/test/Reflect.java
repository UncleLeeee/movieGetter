package com.lee.test;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.lee.movieBeans.MetaDataBean;

public class Reflect {

	/**
	 * @param args
	 * @throws IntrospectionException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		MetaDataBean bean = new MetaDataBean();
		bean.setId(21230133);
		Class clazz = MetaDataBean.class;
		PropertyDescriptor pd = new PropertyDescriptor("id", clazz);
		Method read = pd.getReadMethod();
		Integer id = (Integer) read.invoke(bean);
		System.out.println(id);
	}
}
