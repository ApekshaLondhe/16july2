package failed_Xml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_xml_ex2 {
  @Test
  public void A() {
	  Reporter.log("test case is pass", true);
  }
  
  @Test (timeOut = 100)
  public void B() throws InterruptedException {
	  //Thread.sleep(200);
	  Reporter.log("test case is fail", true); 
  }
  
  @Test
  public void C() {
	  
	  Reporter.log("test case C is fail", true);
  }
  
  @Test
  public void f() {
	  
	  Reporter.log("test case f is fail", true);
  }
  }
  

