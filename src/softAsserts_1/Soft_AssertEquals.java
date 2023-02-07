package softAsserts_1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_AssertEquals {
  @Test
  public void testing1() {
	  
	  String A="APEKSHA";
	  String B="APEKSHA";	  
	  SoftAssert S1=new SoftAssert();
	  
	  S1.assertEquals(A, B,"A AND B NOT EQUAL THAT TIME TEST CASE IS FAIL");
	  
	  S1.assertAll();
	  
	  
	  
	  
  }
}
