package softAsserts_1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_AssertTrue {
  @Test
  public void testing3() {
	  
	  boolean A=true;
	  
	  SoftAssert S3=new SoftAssert();
	  
	  S3.assertTrue(A, "A IS NOT TRUE THAT TIME TEST CASE FAIL");
	  
	  S3.assertAll();
  }
}
