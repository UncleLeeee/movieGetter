package com.lee.getmovies;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import com.mongodb.*;

public class DVDListsGetter {
	private static String dvdURL = "api.rottentomatoes.com/api/public/v1.0/lists/dvds/current_releases.json?";
	private static String apiKey = "2wf4n3y52bt59mhb9bmbhwkp";
	private static String zhuapikey = "7qy4j8nre2tkwdkkjpbbceyf";
	private static int page_limit = 50;
	private static String country = "us";
	private int page = 0;
	
	private String getURL(){
		return dvdURL+"page_limit=" + Integer.toString(page_limit) + "&page=" +
				Integer.toString(page) + "&country=" + country + "&apikey=" + apiKey;
	}
	
	private String readUrl(String urlString) throws Exception {
	    BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
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
