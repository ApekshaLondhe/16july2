package hardasserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertEquls_Method {
	//protected WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
	  WebDriver  driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://neostox.com/");
		 Thread.sleep(1000);
		 Reporter.log("lonching the browser", true);
		 
		  WebElement SignIN = driver.findElement(By.linkText("Sign In"));
		  
		  SignIN.click();
		  
		  WebElement PhonNumber = driver.findElement(By.xpath("//input[@id=\"MainContent_signinsignup_txt_mobilenumber\"]"));
		  PhonNumber.sendKeys("9175846391");
		  
		  WebElement Signin1 = driver.findElement(By.id("lnk_signup1"));
		  
		  Signin1.click();
		  
		  Thread.sleep(1000);
		  
		  WebElement EnterPasscode = driver.findElement(By.id("txt_accesspin"));
		  
		  EnterPasscode.sendKeys("4132");
		  
		  WebElement ClickSubmitButton = driver.findElement(By.id("lnk_submitaccesspin"));
		  
		  Thread.sleep(3000);
		  
		  ClickSubmitButton.click();
		  
		  Thread.sleep(3000);
		
		  
  }
  
  

}
