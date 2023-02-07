package testng_xmlF;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng2 {


   
    @Test(groups = "apps")
    public void E() {
    	Reporter.log("Test E is run", true); 
    }
    
    
    @Test
    public void F()
    {
  	  Reporter.log("Test F is run", true);  
    }
    
    @Test(groups = "apps1")
    public void G()
    {
  	  Reporter.log("Test G is run", true);  
    }
    
    @Test(groups = "apps")
    public void H()
    {
  	  Reporter.log("Test H is run", true);  
    }
    
    
    
    
  }

  
  
  
  
  
  



