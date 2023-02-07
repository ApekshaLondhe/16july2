package softAsserts_1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_AssertNotEquals {
  @Test
  public void Testing2() {
	  
	  String A="ABC";
	  String B="ABC";
	  
	  SoftAssert S2=new SoftAssert();
	  S2.assertNotEquals(A, B, "A AND B ARE THAT TIME TEST CASE FAIL");
	  
	  S2.assertAll();
	  
	  
  }
}
