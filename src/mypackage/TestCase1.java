package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver_win32\\chromedriver.exe");	
    WebDriver driver=new ChromeDriver();
    driver.get("https://paytm.com/");
    Thread.sleep(1000);
    driver.manage().window().maximize();
    driver.getTitle();
    System.out.println(driver.getTitle());
    String title = driver.getTitle();
    System.out.println("title is  "+title);
    String expectedtile="Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
    
 //TEST CASE 1
    if(expectedtile.equals(driver.getTitle()))
    {
    	System.out.println("test case pass");
    }
    else {
    	System.out.println("test case fail");
    }
    
    
    
    
    
    
    
    
	}

}
