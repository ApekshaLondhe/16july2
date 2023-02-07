package softAsserts_1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertFalse {
  @Test
  public void Testing4() {
	  
	  boolean A =false;
	  
	  SoftAssert s4=new SoftAssert();
	  
	  s4.assertFalse(A, "A is true that time test case is fail");
	  
	  s4.assertAll();
  }
}
