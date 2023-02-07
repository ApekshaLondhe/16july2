package softAsserts_1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertFail {
  @Test
  public void Testing7() {
	  
	  SoftAssert S7=new SoftAssert();
	  
	  S7.fail();
	  
	  S7.assertAll();
	  
  }
}
