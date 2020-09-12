package com.marlabs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRandomNumberAddition {
	   @Test
	   public void testRandomNumberAdditionSuccess() {	
	      System.out.println("Inside testRandomNumberAdditionSuccess()");
	      String successMessage = "Addition is correct.";
	      String randomNumbersString = "2,6,89";
	      int iTotalCorrect = 97;
	      
		  //Here is the success test
	      AdditionResultService additionResultService = new AdditionResultService();
		  assertEquals(successMessage, additionResultService.getAdditionResult(randomNumbersString, iTotalCorrect));
	   }


	   @Test
	   public void testRandomNumberAdditionFailure() {	
	      System.out.println("Inside testRandomNumberAdditionFailure()");
	      String failureMessage = "Addition is incorrect. Please try again!";
	      String randomNumbersString = "7,34,68";
	      int iTotalIncorrect = 97;
	      
		  //Here is the failure test
	      AdditionResultService additionResultService = new AdditionResultService();
		  assertEquals(failureMessage, additionResultService.getAdditionResult(randomNumbersString, iTotalIncorrect));
	   }
}
