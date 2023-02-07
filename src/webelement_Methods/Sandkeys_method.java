package webelement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sandkeys_method {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver_win32\\chromedriver.exe");	
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(100);
    //first to write sandkeys
    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("apeksha");
	Thread.sleep(100);
	                 
   WebElement emailIdfild = driver.findElement(By.xpath("//input[@type=\"text\"]"));
   Thread.sleep(100);
   emailIdfild.clear();
   emailIdfild.sendKeys("kalyani");
	
	
	}

}
