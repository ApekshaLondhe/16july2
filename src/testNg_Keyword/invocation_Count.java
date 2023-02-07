package testNg_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation_Count {
	
	//Invocation Count:
	    //sometimes test method or test case need to be excututed multiple times which can be
	    //possible by useing Testng Keyword --> "InvocationCount"
	
	
  @Test
  public void A() {
	  Reporter.log("A test is running", true);
  }
  
  
  @Test(invocationCount = 5)
  public void B() {
	  Reporter.log("B test is running", true);
  }
  
  @Test(invocationCount = 3)
  public void C() {
	  Reporter.log("C test is running", true);
  }
  
  @Test
  public void D() {
	  Reporter.log("D test is running", true);
  }
  
}
