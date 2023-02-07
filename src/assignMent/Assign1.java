package assignMent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("iphone 14 pro max");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()=\"Apple iPhone 14 Pro Max\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@class=\"bmaJhd iJddsb\"])[4]")).click();
        Thread.sleep(100);
      //how meny images in ui
        
        List<WebElement> li = driver.findElements(By.xpath("//div[@class=\"mJxzWe\"]"));
       li.size();
       System.out.println(li.size());
       Thread.sleep(1000);
       System.out.println("==================================================");
       Thread.sleep(1000);
       
        for(WebElement l2:li)
        {
        	System.out.println(l2.getText());
        }
        
        
        
        
        
       
              
	}

}
