package grouping_IN_Xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GrupEx2 {
  @Test(groups="Username")
  public void E() {
	  Reporter.log("Test E is running", true);
  }
  
  @Test(groups="Funds")
  public void F() {
	  Reporter.log("Test F is running", true);
  }
  
  @Test(groups="Username")
  public void G() {
	  Reporter.log("Test G is running", true);
  }

  @Test(groups="Username")
  public void H() {
	  Reporter.log("Test H is running", true);
  }
  
  @Test(groups="Username")
  public void I() {
	  Reporter.log("Test I is running", true);
  }


}
