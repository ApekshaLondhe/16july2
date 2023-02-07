package grouping_IN_Xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GrupEx1 {
  @Test(groups="Username")
  public void A() {
	  Reporter.log("test A is running", true);
  }
  
  @Test(groups="Funds")
  public void B() {
	  Reporter.log("test B is running", true);
  }
  
  @Test(groups="Username")
  public void C() {
	  Reporter.log("test C is running", true);
  }
  
  @Test(groups="Funds")
  public void D() {
	  Reporter.log("test D is running", true);
  }
}
