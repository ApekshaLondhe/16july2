package testNg_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable_Keyword {
	
	//Enable Keyword
	  //Disabiling a Test Method/testCase in TestNg can be achieved by setting the enable 
	  //attribute of the @test Anotation to false
	
	
  @Test(enabled = false)
  public void A() {
	  Reporter.log("A test case is run", true);
  }
  
  @Test
  public void B() {
	  Reporter.log("B test case is run", true);
  }
  
  @Test(enabled = true)
  public void C() {
	  Reporter.log("C test case is run", true);
  }
  
  @Test
  public void D() {
	  Reporter.log("D test case is run", true);
  }
  
  @Test
  public void E() {
	  Reporter.log("E test case is run", true);
  }
}
