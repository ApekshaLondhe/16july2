package testNg_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotion {
	
	@BeforeClass
	public void lounchBrowser() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://login-v2.upstox.com/");
		 Thread.sleep(1000);
		 
	}
	
	  @Test
	  public void B() {
		  Reporter.log("B test method is running", true);
	  }

	
	@BeforeMethod
	public void A()
	{
		Reporter.log("A before method is running", true);
	}
	 @Test
	  public void D() {
		  Reporter.log("D test method is running", true);
	  }

		
  @AfterMethod
  public void c() {
	  Reporter.log("c after method is running", true);
  }
}
