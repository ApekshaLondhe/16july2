package scroling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Virtical_Scrling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(100);
		
		  JavascriptExecutor scrol = (JavascriptExecutor)driver;
		  Thread.sleep(100);
		  scrol.executeScript("window.scrollBy(0,900)");
		  Thread.sleep(100);
		  scrol.executeScript("window.scrollBy(0,300)");
	}

}
