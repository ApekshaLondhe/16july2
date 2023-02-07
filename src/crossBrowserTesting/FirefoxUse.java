package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxUse {
  @Test
  public void FirefoxTesting() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
  }
}
