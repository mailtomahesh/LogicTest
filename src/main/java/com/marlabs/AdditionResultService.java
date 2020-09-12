package com.marlabs;

import java.util.StringTokenizer;
import javax.ws.rs.GET; 
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/AdditionResultService")
public class AdditionResultService {
	   @GET 
	   @Path("/{relevantNumbers}/{total}")
	   public String getAdditionResult(@PathParam("relevantNumbers") String relevantNumbersString, 
			   @PathParam("total") int iUserSentTotal){ 
		   String additionResultMessage = new String();
		   int iTotal = 0;
		   String nextTkn = new String();
		   
		   StringTokenizer tokenizer = new StringTokenizer(relevantNumbersString,",");
		   while(tokenizer.hasMoreTokens()){
			   nextTkn = tokenizer.nextToken();
			   iTotal += Integer.parseInt(nextTkn);
		   }
		   System.out.println("iTotal="+iTotal);
		   System.out.println("iUserSentTotal="+iUserSentTotal);
		   
		   if(iTotal ==  iUserSentTotal)
			   additionResultMessage = "Addition is correct.";
		   else
			   additionResultMessage = "Addition is incorrect. Please try again!";
		   
	       return additionResultMessage;
	   }  
}

