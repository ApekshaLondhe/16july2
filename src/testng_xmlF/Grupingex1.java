package testng_xmlF;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grupingex1 {
  @Test
  public void A() {
	  
	  Reporter.log("test case A is pass", true);
  }
  
  @Test(groups = "Userid")
  public void B() {
	  
	  Reporter.log("test case B is pass", true);
  }
  
  @Test(groups = "Userid")
  public void C() {
	  
	  Reporter.log("test case C is pass", true);
  }
  
  @Test(groups = "funds")
  public void D() {
	  
	  Reporter.log("test case D is pass", true);
  }
  
  
  
}
