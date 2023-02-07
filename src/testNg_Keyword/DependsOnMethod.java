package testNg_Keyword;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test
  public void A() {
	  fail();
	  Reporter.log("Test case A Running",true);
  }
  
  @Test
  public void B() {
	  Reporter.log("Test case B Running",true);
  }
  
  @Test
  public void C() {
	  Reporter.log("Test case C Running",true);
  }
  
  @Test
  public void D() {
	  Reporter.log("Test case D Running",true);
  }
  
  @Test
  public void E() {
	  Reporter.log("Test case E Running",true);
  }
  
  @Test(dependsOnMethods = {"A","B"})
  public void f() {
	  Reporter.log("Test case F Running",true);
  }
}
