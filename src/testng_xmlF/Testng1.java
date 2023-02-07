package testng_xmlF;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng1 {
  @Test(groups = "apps")
  public void A() {
	  Reporter.log("test A is run", true);
  }
  
  
  @Test(groups = "apps1")
  public void B()
  {
	  Reporter.log("Test B is run", true);  
  }
  
  @Test(groups = "apps1")
  public void C()
  {
	  Reporter.log("Test C is run", true);  
  }
  
  @Test(groups = "apps")
  public void D()
  {
	  Reporter.log("Test D is run", true);  
  }
  
  
  
  
}
