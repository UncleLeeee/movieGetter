package com.lee.movieHelper;
import com.google.gson.Gson;
import com.lee.mongoHelper.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.util.JSON;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovieReader {
	private static String filePath = "./Data/ratings.list";
	
	
	public static void main(String[] args) {
		try {
			new MovieReader().readMovies();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void readMovies() throws FileNotFoundException{
		BufferedReader in = new BufferedReader(new FileReader(filePath));
		try {
			String oneLine;
			int counter = 0;
			MongoConnection conn = new MongoConnection();
			DBCollection coll = conn.getCollection("Movies", "largeVotes");
			while((oneLine = in.readLine()) != null){
				
				Movie oneMovie = new Movie();
				String[] lineStr = oneLine.split("\\s+", 5);
				String movieName = lineStr[lineStr.length-1];
				oneMovie.setVotes(Integer.parseInt(lineStr[2]));
				if(oneMovie.getVotes()<2000) continue;
				oneMovie.setRatings(Double.parseDouble(lineStr[3]));
				if(movieName.startsWith("\"")){
					String[] nameStr = movieName.split("\"");
					oneMovie.setName(nameStr[1]);
				}
				else{
					int index = movieName.indexOf("(");
					String name = movieName.substring(0, index-1);
					oneMovie.setName(name);
				}
				boolean hasStrange = !oneMovie.getName().matches("^[\\x00-\\x7F]*$");
				if(hasStrange) continue;
				
		        Pattern sip = Pattern.compile("\\(([^\\)]*)\\)"); 
		        Matcher mp = sip.matcher(movieName);
		        if(mp.find()){
		            String year = mp.group(1);
		            if(year.length() == 4) oneMovie.setYear(year);
		        }
				
		        if(oneMovie.getYear() == null) continue;
		        Gson gson = new Gson();
		        String json = gson.toJson(oneMovie);
		        BasicDBObject oneObj = (BasicDBObject) JSON.parse(json);
		        coll.insert(oneObj);
		        counter++;
				System.out.println(oneMovie);
			}
			
			System.out.println(counter);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
