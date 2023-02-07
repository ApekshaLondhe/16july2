package failed_Xml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FiledXmI_EX1 {
  @Test
  public void f() {
	 // Assert.fail();
	  Reporter.log("Test F is run", true);
  }
  
  
  @Test(timeOut = 200)
  public void B() throws InterruptedException
  {   Thread.sleep(300);
	  Reporter.log("Test B is run", true);  
  }
  
  @Test
  public void C()
  {
	  Reporter.log("Test C is run", true);  
  }
  
  @Test
  public void D()
  {
	  Reporter.log("Test D is run", true);  
  }
  
}
