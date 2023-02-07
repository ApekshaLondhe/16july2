package webdriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_method {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    //open the application with help of get() method
   
    
    driver.get("https://vctcpune.com/");
    
    //here we use the quite() method 
    //santax of quite() method=quite();
    //quite method not asking the parameter
    //with help of quite method we can close all tabs open by the selenium tool
    driver.findElement(By.xpath("//a[text()=\"Start Selenium Practice\"]")).click();
    //driver.close();
    driver.quit();
    
    
	
	
	}

}
