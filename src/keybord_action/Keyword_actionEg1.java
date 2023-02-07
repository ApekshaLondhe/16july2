package keybord_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyword_actionEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
		Actions act=new Actions(driver);
		
	 WebElement username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
		act.moveToElement(username).sendKeys("xyz").build().perform();
		
		
	WebElement button = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
	
	act.moveToElement(button).click().build().perform();
	Thread.sleep(2000);
	// WebElement days = driver.findElement(By.id("day"));
   // Thread.sleep(2000);
   // act.click(days).perform();
   // Thread.sleep(2000);
   // act.sendKeys(Keys.ARROW_UP).perform();
   // Thread.sleep(2000);
  ////  act.sendKeys(Keys.ARROW_UP).perform();
    //Thread.sleep(2000);
   // act.sendKeys(Keys.ARROW_UP).perform();
   // Thread.sleep(2000);
    //act.sendKeys(Keys.ENTER).perform();
    
    
   // for(int i=1;i<=4;i++)
   // {Thread.sleep(2000);
    	//act.sendKeys(Keys.ARROW_UP).perform();
	
   // }
   // act.sendKeys(Keys.ENTER).perform();
    
    Thread.sleep(2000);
     WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
     Thread.sleep(2000);
    act.moveToElement(firstname).sendKeys("apeksha").build().perform();
    
    
   
	}

}
