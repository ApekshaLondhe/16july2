package failed_Xml;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_XmlEx3 {
  @Test
  public void A() {
	  fail();
	  Reporter.log("test case A is running", true);
  }
  
  
  @Test
  public void B() {
	  Reporter.log("test case B is running", true);
  }
  
  
  @Test
  public void C() {
	 // fail();
	  Reporter.log("test case C is running", true);
  }
  
  @Test
  public void D() {
	  Reporter.log("test case D is running", true);
  }
  
  @Test
  public void E() {
	  Reporter.log("test case E is running", true);
  }
}
