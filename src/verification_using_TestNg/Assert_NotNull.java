package verification_using_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_NotNull {
  @Test
  public void testing6() {
	  
	  String A="apeksha";
	  Assert.assertNotNull(A, "A is null that time test case is fail");
  }
}
