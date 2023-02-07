package verification_using_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_false {
  @Test
  public void Testing4() {
	  boolean A=false;
	  Assert.assertFalse(A, "A is true then test case is fail");
	  
  }
}
