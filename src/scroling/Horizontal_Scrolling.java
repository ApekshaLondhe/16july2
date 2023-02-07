package scroling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontal_Scrolling {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(500);
		
		WebElement id = driver.findElement(By.name("userId"));
		id.sendKeys("55BNWJ");
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("A27@santosh");
        WebElement clickbuttion = driver.findElement(By.xpath("//div[text()=\"Sign into Upstox\"]"));
        clickbuttion.click();
        Thread.sleep(2000);
       WebElement passcode = driver.findElement(By.name("yob"));
       // passcode.sendKeys("1995");
       JavascriptExecutor sendkys = (JavascriptExecutor)driver;
       sendkys.executeScript("arguments[0]. value='1995';", passcode);
        
        Thread.sleep(7000);
        WebElement fine = driver.findElement(By.xpath("//div[text()=\"No, I’m good\"]"));
         fine.click();
                
        JavascriptExecutor horizontal_scrol = (JavascriptExecutor)driver;
		  Thread.sleep(600);
		 // scrol.executeScript("window.scrollBy(0,50)");
		  Thread.sleep(500);
		  horizontal_scrol.executeScript("window.scrollBy(300,0)");
		 Thread.sleep(500);
		 horizontal_scrol.executeScript("window.scrollBy(-100,0)");
		 
	}

        
	}


