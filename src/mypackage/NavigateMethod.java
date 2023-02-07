package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	driver.navigate().to("https://web.whatsapp.com/");
	Thread.sleep(100);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(100);
	driver.navigate().refresh();
	Thread.sleep(100);
	
	
	

	}

}
