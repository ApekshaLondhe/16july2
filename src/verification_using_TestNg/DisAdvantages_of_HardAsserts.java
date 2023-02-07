package verification_using_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisAdvantages_of_HardAsserts {
  @Test
  public void Testing8() {
	  
	  String A="APEKSHA";
	  String B="APEKSHA";
	  
	  Assert.assertNull(A, "A is not null that time testcase fail");
	  Assert.assertEquals(A, B,"A and b not equals that time test case is fail");
	  
	  
  }
  
  
  @Test
  public void Testing9(){
	  String A="APEKSHA";
	  String B="APEKSHA";
	  Assert.assertEquals(A, B,"A and b not equals that time test case is fail");
	  
  }
  
  
}
