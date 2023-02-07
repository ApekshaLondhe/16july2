package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_Ongeturl {

public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.get("https://telegram.org/");
 Thread.sleep(100);
 driver.getCurrentUrl();
 System.out.println(driver.getCurrentUrl());
 String currrenturl = driver.getCurrentUrl();
 System.out.println("url is "+currrenturl);
 String expectedurl="https://telegram.org/";
 
 //test case on url
 if(expectedurl.equals(driver.getCurrentUrl()))
{
	System.out.println("test case is pass"); 
}
 else {
	 System.out.println("test case fail");
 }
 
 
 
 
 
 
	}

}
