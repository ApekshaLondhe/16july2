package sirially_parallalyExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SiriallyExcutionEx3 {
  @Test
  public void Login1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://neostox.com/");
		 Thread.sleep(1000);
		 Reporter.log("lonching the browser one", true);	 
  }
  
  @Test
  public void Login2() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://neostox.com/");
		 Thread.sleep(1000);
		 Reporter.log("lonching the browser two", true);	 
  }
  
  @Test
  public void Login3() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://neostox.com/");
		 Thread.sleep(1000);
		 Reporter.log("lonching the browser Three", true);	 
  }
}
