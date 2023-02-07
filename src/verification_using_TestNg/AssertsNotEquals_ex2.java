package verification_using_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsNotEquals_ex2 {
  @Test
  public void Testng2() {
	  
	  String A="apeksha";
	  String B="apeksha1";
	  Assert.assertNotEquals(A, B,"both A and B SAME That time test case is fail" );
  }
}
