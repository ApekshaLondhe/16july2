package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();

    //1) get();method= with help get() method we can enter url in or to open the application
    //2)sentax of get method=driver.get("https://www.facebook.com/");
	//3)you enter the url that time run the program that time open the application
	//4)get method asking the prameter
    //5)with help get method we are lonching the application
    
    driver.get("https://www.facebook.com/");
	
	
	
	
	}

}
