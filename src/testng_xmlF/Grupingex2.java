package testng_xmlF;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grupingex2 {
  @Test(groups = "funds")
  public void E() {
	  Reporter.log("test case E pass", true);
  }
  
  @Test(groups = "funds")
  public void f() {
	  
	  Reporter.log("test case f is pass", true);
  }
  
  @Test(groups = "Userid")
  public void G() {
	  
	  Reporter.log("test case G is pass", true);
  }
  
  @Test(groups = "Userid")
  public void h() {
	  
	  Reporter.log("test case H is pass", true);
  }
}
