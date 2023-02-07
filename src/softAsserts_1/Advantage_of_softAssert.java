package softAsserts_1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Advantage_of_softAssert {
	SoftAssert S8=new SoftAssert();
  @Test
  public void Testing8() {
	  
	  String A="ABC";
	  String B="ABC";
	  
	  
	  S8.assertNull(A, "A IS NOT NULL THAT TIME TEST CASE FAIL");
	  S8.assertEquals(A, B,"A AND B ARE BOTH NOT EQUAL THAT TIME TEST CASE FAIL");
	   
	  S8.assertAll();
	  
	   
  }
  @Test
  public void Testing9()
  {
	  boolean B=true;
	  
	  S8.assertTrue(B, "A is not true that time test case fail");
	  
	 // S8.assertAll();
	  
	  
	  
  }
  
  
  
  
  
}
