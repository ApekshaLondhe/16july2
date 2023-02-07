package framework_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import upStock_Pom.Upstock_passcode;

public class Facebook_test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);

		Login_PAGE test=new Login_PAGE(driver);
		test.sendkeyusername();
		test.sendkeyspassword();
		//test.sendkeyusername();
		test.clickloginbuttion();
		
		
		
		
		
		
		
		
		
		
	}

}
