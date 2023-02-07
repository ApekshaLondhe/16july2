package testNg_Keyword;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut_keyword {
	
	//TimeOut keyword
	  //if test class contains multiple test methods .if one of the test method is time consuming
	  //to excute then testng bydeafult fail that test case& excutes the other
	
	
	
  @Test(timeOut = 10)
  public void a() {
	  fail();
	  Reporter.log("A test case is run", true);
  }
  
  @Test
  public void b() {
	  Reporter.log("B test case is run", true);
  }
  
  @Test
  public void c() {
	  Reporter.log("C test case is run", true);
  }
  
  @Test
  public void d() {
	  Reporter.log("D test case is run", true);
  }
  
  @Test
  public void e() {
	  Reporter.log("E test case is run", true);
  }
}
