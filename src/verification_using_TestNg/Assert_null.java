package verification_using_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_null {
  @Test
  public void Testing5() {
	  String A =null;
	  Assert.assertNull(A, "a is not that time test case fail");
  }
}
