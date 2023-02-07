package grouping_IN_Xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grup3Ex3 {
  @Test(groups="Username")
  public void J() {
	  Reporter.log("test j is running", true);
  }
  
  @Test(groups="Funds")
  public void K() {
	  Reporter.log("test K is running", true);
  }
  
  @Test(groups="Username")
  public void L() {
	  Reporter.log("test L is running", true);
  }
  @Test(groups="Username")
  public void M() {
	  Reporter.log("test M is running", true);
  }
  
  @Test(groups="Funds")
  public void N() {
	  Reporter.log("test N is running", true);
  }
}
