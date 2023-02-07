package softAsserts_1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_AssertNotnull {
  @Test
  public void Testing6() {
	  
	  String A="Apeksha";
	  
	  SoftAssert S6=new SoftAssert();
	  
	  S6.assertNotNull(A, "A IS NULL THAT TIME TEST CASE IS FAIL");
	   
	  S6.assertAll();
  }
}
