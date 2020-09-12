package com.marlabs;

import java.util.ArrayList;
import java.util.List; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 

@Path("/RandomNumberService")
public class RandomNumberService {
		public RandomNumberService()
		{
			
		}
		
	   @GET 
	   @Path("/") 
	   public List<Integer> getRandomNumbers(){ 
	      List<Integer> randomNumberList = new ArrayList<Integer>();
	      
	      //Generate random numbers
	      int j = 1 + (int) (Math.random() * 10);
	      //Making sure that at least 2 numbers are available for addition
	      if (j == 1)
	    	  j = 2;
	      for (int i = 1; i <= j; i++) 
	      {
	    	  int x = 1 + (int) (Math.random() * 100);
	    	  randomNumberList.add(new Integer(x));
	      }
	      
	      return randomNumberList;
	   }  
}
