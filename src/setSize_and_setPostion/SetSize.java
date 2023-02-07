package setSize_and_setPostion;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		
  //how to getsize of window
		driver.manage().window().getSize();
		Dimension defultsize = driver.manage().window().getSize();
	   System.out.println(defultsize);
	   
 //to create the object of dimension class
	   Dimension d=new Dimension(900, 600);
	    driver.manage().window().setSize(d);
	   System.out.println(d);
	   
	   
	   Dimension D=new Dimension(1000, 1000);
	    driver.manage().window().setSize(D);
	   System.out.println(D);
	   
	   
	   

	}

}
