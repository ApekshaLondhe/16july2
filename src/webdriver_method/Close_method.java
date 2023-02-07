package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_method {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe" );
     WebDriver driver=new ChromeDriver();
     //close();method=with help of close method we can close the current tab of the browser opened bye the selenium
     //sentax of close method=driver.close();
     //close() method not asking the parametar
     
     // first we open the application with help get() method
     
     driver.get("http://hike.com/");
     
     //open application
     //here you close the application with help of close method
     
     driver.close();
     
	}

}
