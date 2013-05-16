package com.lee.getmovies;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Set;

import com.google.gson.Gson;
import com.mongodb.*;
import com.mongodb.util.JSON;

public class MoviesGetter {
	
	public static String sendQuery(APIGetter mGetter) throws Exception{
		String res = readUrl(mGetter.getQueryString());
		if(res.startsWith("[")) res = res.substring(1, res.length()-1);
		if(mGetter.jsonIsNull(res)) res = null;
		return res;
	}
	
	public static String readUrl(String urlString) throws Exception {
	    BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
	        URLConnection uc = url.openConnection();
	         uc.addRequestProperty("User-Agent", 
	         "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
	         uc.connect();
	        reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
	        StringBuffer buffer = new StringBuffer();
	        int read;
	        char[] chars = new char[1024];
	        while ((read = reader.read(chars)) != -1)
	            buffer.append(chars, 0, read); 

	        return buffer.toString();
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}

}
