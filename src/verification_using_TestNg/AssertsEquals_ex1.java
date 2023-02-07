package verification_using_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsEquals_ex1 {
  @Test
  public void testing() { 
	  String A="apeksha";
	  String B ="apeksha";
	  Assert.assertEquals(A, B,"BOTH ARE NOT SEM TEST CASE IS FAIL");
  }
}
