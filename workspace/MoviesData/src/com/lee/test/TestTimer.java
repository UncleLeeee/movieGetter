package com.lee.test;

public class TestTimer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long begin = System.currentTimeMillis();
			Thread.sleep(1000);
			long end = System.currentTimeMillis();
			System.out.println(end - begin);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
