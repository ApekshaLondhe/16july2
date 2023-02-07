package verification_using_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts_true {
  @Test
  public void Testing3() {
	  
	  boolean A=true;
	  Assert.assertTrue(A, "A is false test case is fail");
  }
}
