package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrosertesting_ex1 {
	WebDriver driver;
  @Parameters("browserName")
  @Test
  public void CB_Testing(String Bname) {
	  
	  if(Bname.equals("firefox")){
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  else if(Bname.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
			 driver=new ChromeDriver();
	  }
	  
	  driver.get("https://www.facebook.com/");
		  
	  
  }
}
