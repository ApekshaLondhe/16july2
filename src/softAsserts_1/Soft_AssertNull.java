package softAsserts_1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_AssertNull {
  @Test
  public void Testing5() {
	  
	  String A=null;
	  
	  SoftAssert S5=new SoftAssert();
	  
	  S5.assertNull(A, "A is not null that time test case is fail");
	  
	  S5.assertAll();
	  
	  
  }
}
