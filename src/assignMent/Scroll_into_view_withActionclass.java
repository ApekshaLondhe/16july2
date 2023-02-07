package assignMent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_into_view_withActionclass {

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
        Thread.sleep(4000);
        WebElement passcode = driver.findElement(By.name("yob"));
        passcode.sendKeys("1995");
       
       Thread.sleep(8000);
       WebElement fine = driver.findElement(By.xpath("//div[text()=\"No, I’m good\"]"));
        fine.click();
        
 //we perform the scrolling into view with help of action class
        
     Actions act=new Actions(driver);   
 // 1)1st way 
      WebElement text = driver.findElement(By.xpath("//div[text()=\"All\"]"));  
     
    act.scrollToElement(text).perform();
    System.out.println(text.getText());
        
        
        
        
        
        
        
        
        

	}

}
