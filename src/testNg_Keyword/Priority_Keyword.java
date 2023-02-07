package testNg_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Keyword {
	
	
	//Priority keyword :
	  // To change the test Method/testCase excution order we need to use Testng keyword
	
	//priority can be
//1)Bydefault =0
//2)+ve integer
//3)-ve integer
//4)Duplicate
	
	//priority can't be
//1)Decimal
//2)Veriables
	
	 
  @Test(priority = 6)
  public void A() {
	  Reporter.log("A test case is running", true);
  }
  
  
  @Test(priority = 5)
  public void B() {
	 Reporter.log("B test case is running", true);
  }

  
  @Test(priority = 4)
  public void C() {
	  Reporter.log("C test case is running", true);
  }

  
  @Test(priority = 3)
  public void D() {
	  Reporter.log("D test case is running", true);
  }
  
  
  @Test(priority = 1)
  public void E() {
	  Reporter.log("E test case is running", true);
  }

  @Test(priority = 1)
  public void f() {
	  Reporter.log("F test case is running", true);
  }

}
