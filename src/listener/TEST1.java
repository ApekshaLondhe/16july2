package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class TEST1 {
  @Test
  public void A() {
	  Reporter.log("A test case is pass", true);
  }
  
  
  @Test
  public void B() {
	  Assert.fail();
	  Reporter.log("B is fail", true);
  }
  
  @Test(dependsOnMethods = "B")
  public void C() {
	  Reporter.log("C is Skip", true);
  }
  }
  

